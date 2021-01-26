package stepDefenition ;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import resources.base;

import org.junit.runner.RunWith;


import PageObjects.Rahulloginpage;
import PageObjects.landingPageR;
import PageObjects.portalHomePage;

@RunWith(Cucumber.class)
public class Login extends base {
	Rahulloginpage rlp ;
	portalHomePage php ;
	
	
    @Given("^Intialize the chrome browser$")
    public void intialize_the_chrome_browser() throws Throwable {
    	driver = initializeBrowser();
    }

    @And("^Naviagate to \"([^\"]*)\" Site$")
    public void naviagate_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);
       
    }

    @And("^Click on Login button in home page and land on secure sign in page$")
    public void click_on_login_button_in_home_page_and_land_on_secure_sign_in_page() throws Throwable {
    	landingPageR lnpr = new landingPageR(driver);
	    rlp = lnpr.LoginButton() ;
		
       
    }
    
    @When("^User enters the (.+) and (.+)$")
    public void user_enters_the_and(String username, String password) throws Throwable {
	rlp.Username().sendKeys(username);
		
		rlp.Password().sendKeys(password);
		php = rlp.LogginButton();
    }


    @When("^User enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_the_something_and_something(String strArg1, String strArg2) throws Throwable {
    	rlp.Username().sendKeys(strArg1);
		
		rlp.Password().sendKeys(strArg2);
		php = rlp.LogginButton();
       
    }

    @Then("^Verify that the user is successfully logged$")
    public void verify_that_the_user_is_successfully_logged() throws Throwable {
    	
        Assert.assertTrue(php.Searchbox().isDisplayed());
    }
    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.close();
    }


   
}