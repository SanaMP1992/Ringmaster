package Excel.FrameE2Eproject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import PageObjects.LandingPage;
import PageObjects.LogginPage;
import PageObjects.ResetPage;
import junit.framework.Assert;
import resources.base;

public class GetText extends base {
	
	public static Logger  log = LogManager.getLogger(base.class.getName());
	public WebDriver driver ;
	LogginPage lp ;
	ResetPage rp ;
	@BeforeTest
	public void intiliaze ()  throws IOException {{
		
		driver = initializeBrowser();
		log.info("Driver is intialised");
		driver.get(prop.getProperty("url"));
		log.info("Website is loaded");
		LandingPage lnp = new LandingPage(driver);
		lp = lnp.LoginButton() ;
		log.info("Login button in the Home page is clicked");
	    rp =  lp.ForgetPassword() ;
	    log.info("Forget Password link is clicked ");
		
		
	} }
	 
    @Test
	public void CheckText() {
    String check =	rp.ResetPwd().getText();
    	Assert.assertEquals(check, "Reset Password");
    	 log.info("Compared the two strings");
		
		
	}
    
    public void tearDown() {
    	
    	driver.close();
    	log.info("Driver is closed");
    }
	
	}

