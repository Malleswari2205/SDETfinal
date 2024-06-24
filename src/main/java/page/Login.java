package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login {
	private static WebDriver driver;
	private static By username=By.id("user-name");
	private static By password=By.id("password");

	public Login(WebDriver driver) {
		
		this.driver = driver;
	}
	public static void username(String uname) {
		driver.findElement(username).sendKeys(uname,Keys.ENTER);
	}
	public static void password(String pwd) {
		driver.findElement(password).sendKeys(pwd,Keys.ENTER);
	}
	

}
