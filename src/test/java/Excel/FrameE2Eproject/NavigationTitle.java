package Excel.FrameE2Eproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import junit.framework.Assert;
import resources.base;

public class NavigationTitle extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	public WebDriver driver ;
	LandingPage lnp = new LandingPage(driver);
	@BeforeTest
	public void intialise() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		log.info("Driver is intialised");
		}
	@Test
	public void navigationTitle() throws IOException {
		
		lnp = new LandingPage(driver);
		
		Assert.assertEquals(lnp.getTitle().getText(), "FEATURED COURSES");
		log.info("Title is Validated");
	}
	@Test
	public void headerTitle() throws IOException {
		
		lnp = new LandingPage(driver);
		
		Assert.assertEquals(lnp.getHeader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		log.info("SubTitle is Validated");
	}
	
	
	@AfterTest
	public void tearDown() {
		
		
		driver.close();
		log.info("driver is closed");
	}

}
