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

public class VisbityTest extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	public WebDriver driver ;
	@BeforeTest
	public void intialise() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url")); 
		log.info("Driver is intialised");}
	
	@Test
	public void visbility() {
		
		LandingPage lnp = new LandingPage(driver);
		Assert.assertEquals(true, lnp.naviagationTitle().isDisplayed());
		log.info("Home page Title bar button is validated");
	
	}

	
	@AfterTest
	public void teardown() {
		
		driver.close();
	log.info("driver is closed");	
	}
}
