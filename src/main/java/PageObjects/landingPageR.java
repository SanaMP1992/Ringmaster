package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class landingPageR {
	
	WebDriver driver ;
	By loginButton = By.cssSelector("a[class='theme-btn register-btn']");
	
	public landingPageR(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
		
	}
	
	public Rahulloginpage LoginButton() {
		
	      driver.findElement(loginButton).click();
	      Rahulloginpage Rlp = new Rahulloginpage(driver);
	      return Rlp ;
			
		}

	
}
