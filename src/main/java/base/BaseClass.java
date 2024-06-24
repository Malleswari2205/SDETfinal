package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	Properties prop;
	
	WebDriver driver;
	
	public WebDriver init_driver(Properties prop) {
		
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		} 
		else {
			System.out.println("incorrect browser"+browsername);
		}
		driver.get(prop.getProperty("url"));
		return driver;
		
	}
	public Properties init_prop() {
		prop=new Properties();
		try {
			FileInputStream fip=new FileInputStream(".src\\test\\resources\\config\\config.properties");
			prop.load(fip);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
	
	
	
//	
	

}
