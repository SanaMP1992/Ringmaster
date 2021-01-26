package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogginPage {
	
	WebDriver driver ;
	
	

	public LogginPage(WebDriver driver) {
		this.driver =driver ;
	}

	

	By username = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By logginButton = By.xpath("//input[@name='commit']");
	By forgetpassword = By.cssSelector("a[class='link-below-button']");
	
	public WebElement Username()
	{
		 return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		 return driver.findElement(password);
	}
	
	public WebElement LogginButton()
	{
		 return driver.findElement(logginButton);
		
	}
	public ResetPage ForgetPassword()
	{
	    driver.findElement(forgetpassword).click();
	    ResetPage rp = new ResetPage(driver);
	    return rp ;
	}
	
	
	
	
}



