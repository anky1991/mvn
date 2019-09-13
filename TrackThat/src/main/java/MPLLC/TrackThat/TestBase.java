package MPLLC.TrackThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//@Listeners(MPLLC.TrackThat.FWListners.class)
public class TestBase extends FWListners 
{
   public Logger log =Logger.getLogger(TestBase.class);;
   public WebDriver driver;
   public Properties prop =new Properties() ;
   public FileInputStream fis; 
  
   public TestBase()
   {
	    File f = new File(System.getProperty("user.dir"));
 		File fSrc = new File(f, "data.properties");
 		try 
 		{
 		  fis = new FileInputStream(fSrc.getAbsolutePath());
 		} catch (FileNotFoundException e1) 
 		{
 		  e1.printStackTrace();
 		}
 		try
 		{
 		  prop.load(fis);
		  log.info("Property file load Successfully");
 		} catch (IOException e)
 		{
 		  e.printStackTrace();
 		}
   }
   
   public void invokeBrowser(String BrowserName)
       {
	   if(BrowserName.equalsIgnoreCase("Chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		   driver = new ChromeDriver();   
		   log.info("Chrome Browser load succesfully");
		   System.out.println("driver initilize in base" +" " + driver);
	   }
	   else if(BrowserName.equalsIgnoreCase("FF")) 
	   {
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
			System.setProperty("webdriver.gecko.driver", "/home/local/MPROG/ankit.sharma/Downloads/geckodriver");
			driver = new FirefoxDriver();
			log.info("Firefox Browser load succesfully");
	   }
	   else if(BrowserName.equalsIgnoreCase("Safari"))
	   {
			driver = new SafariDriver();
	   }
	   else if(BrowserName.equalsIgnoreCase("IE")) 
	   {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/IEDriverServer");
	   }
	 	driver.manage().window().maximize();
   		driver.manage().deleteAllCookies();
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.get(prop.getProperty("URL"));
		log.info("URL load successfully");
	   }
	   public void quiteBroswer()
	   {
		   driver.quit();
	   }
	   
       }
