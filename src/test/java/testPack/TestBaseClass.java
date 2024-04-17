package testPack;

import java.io.IOException;
import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilitiesPack.UtilityClass;

public class TestBaseClass 
{
 WebDriver driver;
 Logger log = Logger.getLogger("DemoQA");
 
 @BeforeMethod
 public void preMethod() throws InterruptedException, IOException
 {
	PropertyConfigurator.configure("Log4j.properties"); 
	
	driver = new ChromeDriver();
	log.info("Browser is opened");
	Thread.sleep(1000);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	log.info("Browser is maximized");
	Thread.sleep(1000);
	
	driver.get("https://demoqa.com/");
	log.info("URL is opened");
	Thread.sleep(1000);

	UtilityClass uc = new UtilityClass();
	uc.screenShotMethod(driver, "HomePage");
	log.info("HomePageSnap is Taken");
	Thread.sleep(1000);

 }
 
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("browser is closed");
		log.info("End of Script");
	}
}
