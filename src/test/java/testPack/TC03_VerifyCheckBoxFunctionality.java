package testPack;

import org.testng.annotations.Test;

import pomPack.ElementCheckBoxPOMClass;
import pomPack.ElementsPOMClass;

public class TC03_VerifyCheckBoxFunctionality extends TestBaseClass
{
@Test
public void verifyCheckBoxFunctionality() throws InterruptedException
{
	ElementsPOMClass epc = new ElementsPOMClass(driver);
	epc.clickElementsCard();
	log.info("clicked on elements cards");
	Thread.sleep(1000);
	
	ElementCheckBoxPOMClass cb = new ElementCheckBoxPOMClass(driver);
	cb.clickElementCheckBox();
	log.info("clicked on elements check box");
	Thread.sleep(1000);
	
	cb.clickCheckBox();
	log.info("clicked on Check Box");
	Thread.sleep(1000);
	
	log.info("Apply Validation");
	
	cb.isSelectedCheckBox();
}
}
