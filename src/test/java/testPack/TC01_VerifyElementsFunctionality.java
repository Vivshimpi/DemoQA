package testPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPack.ElementsPOMClass;
import utilitiesPack.UtilityClass;

public class TC01_VerifyElementsFunctionality extends TestBaseClass
{
@Test
public void verifyElementsFunctionality() throws InterruptedException, IOException
{
	ElementsPOMClass ep = new ElementsPOMClass(driver);
	ep.clickElementsCard();
	log.info("clicked on elements cards");
	Thread.sleep(1000);
	
	UtilityClass uc = new UtilityClass();
    uc.screenShotMethod(driver, "Elements");
    
    log.info("aplly verification");
    String expectedurl = "https://demoqa.com/elements";
    String actualurl = driver.getCurrentUrl();
    
    Assert.assertEquals(actualurl, expectedurl, actualurl);
    
    
}
}
