package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
WebDriver driver ;
	
	By loginButton = By.cssSelector("i[class='fa fa-lock fa-lg']");
	By title = By.xpath("//div[@class='text-center']");
	By naviagationTitle = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	By headerTitle = By.cssSelector("div[class*=\" video-banner\"] p");
	By popup = By.xpath("//button[text()='NO THANKS']");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
		
	}

	public LogginPage LoginButton() {
		
      driver.findElement(loginButton).click();
      LogginPage lp = new LogginPage(driver);
      return lp ;
		
	}

	public WebElement getpopup() {
		
		return driver.findElement(popup) ;
	}
public List<WebElement> getpopupsize() {
		
		return driver.findElements(popup) ;
	}
	
	
	
public WebElement getTitle() {
		
		return driver.findElement(title);
		
	}
public WebElement getHeader() {
	
	return driver.findElement(headerTitle);
}

public WebElement naviagationTitle() {
	
	return driver.findElement(naviagationTitle);
	
}




}
