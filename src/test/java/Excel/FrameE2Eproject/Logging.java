package Excel.FrameE2Eproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LogginPage;
import resources.base;

public class Logging extends base{
	public static Logger  log = LogManager.getLogger(base.class.getName());
	 LogginPage lp ;
	
	public WebDriver driver ;
	@BeforeTest
	public void intialise() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		LandingPage lnp = new LandingPage(driver);
		if(lnp.getpopupsize().size()>0) {
			
			lnp.getpopup().click(); // to click the popup if it appeared
		}
		log.info("Driver is intialised");
	    lp = lnp.LoginButton() ;
		log.info("clicked the login button in the home page");
		
	}
	@Test(dataProvider="getData")
	public void checkdata (String Username,String Password) {
		
		
		
		lp.Username().sendKeys(Username);
		log.info("Username given is" + Username);
		lp.Password().sendKeys(Password);
		log.info("Password given is" + Password);
	
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "sana.abdulwahab14@gmail.com";
		data[0][1] = "56789010";
		data[1][0] = "getsana@gmail.com";
		data[1][1]= "12456789";
		return data ;
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}


}
