package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rahulloginpage {
	

		
	WebDriver driver ;
	
	By username = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By logginButton = By.xpath("//input[@name='commit']");

		public Rahulloginpage(WebDriver driver) {
			this.driver =driver ;
		}
		public WebElement Username()
		{
			 return driver.findElement(username);
		}
		
		public WebElement Password()
		{
			 return driver.findElement(password);
		}
		
		public portalHomePage LogginButton()
		{
			 driver.findElement(logginButton).click();
			 portalHomePage php = new portalHomePage(driver);
			 return php ;
		}
}
