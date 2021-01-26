package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver ;
	public Properties prop ;
	
	public WebDriver initializeBrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\91906\\eclipse-workspace\\FrameE2Eproject\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		//String browserName = System.getProperty("browser");
		if (browserName.contains("chrome")) {
	     System.setProperty("webdriver.chrome.driver", "C:\\Sana_WORK\\personal\\Driver\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	     if (browserName.contains("headless")) {
	     options.addArguments("headless");}
	     
		 driver = new ChromeDriver(options);
			
		}
		
		else if (browserName.equals("firefox")) {
			
			
	    System.setProperty("webdriver.gecko.driver", "C:\\Sana_WORK\\personal\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
			
		}
		
		else if (browserName.equals("IE")) {
			
			
			System.setProperty("webdriver.ie.driver", "C:\\Sana_WORK\\personal\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	 return driver ;
		
		
		
	}
	
	public String getScreenshot(String testCaseName , WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") +"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(Source, new File(destinationFile));
		return destinationFile ;
	}

}



