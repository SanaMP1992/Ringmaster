package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPage {
	WebDriver driver ;
	
	By resetPwd = By.xpath("//section[@id='hero']//div//h1");
	
	public ResetPage(WebDriver driver) {
		
		this.driver = driver ;
	}
	
	
	public WebElement ResetPwd() {
		return driver.findElement(resetPwd);
		
	}

}
