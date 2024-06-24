package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import base.BaseClass;

public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	BaseClass bc;
	
	@BeforeTest
	public void Setup() {
		
		bc=new BaseClass();
		prop=bc.init_prop();
		driver=bc.init_driver(prop);
		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	
	

}
