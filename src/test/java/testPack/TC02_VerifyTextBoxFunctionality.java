package testPack;

import org.testng.annotations.Test;

import pomPack.ElementsPOMClass;

public class TC02_VerifyTextBoxFunctionality extends TestBaseClass
{
	
String fullName = "Manish Malhotra";
String email = "manubhau@gmail.com";
String cAddress = "Mumbai";
String pAddress = "Pune";

@Test
public void VerifyTextBoxFunctionality() throws InterruptedException
{

	ElementsPOMClass ep = new ElementsPOMClass(driver);
	ep.clickElementsCard();
	log.info("clicked on elements cards");
	Thread.sleep(1000);
	
	ep.clickOnTextBox();
	log.info("clicked on Text Box");
	Thread.sleep(1000);
	
	ep.sendFullName(fullName);
	log.info("Entered Full Name");
	Thread.sleep(1000);
	
	ep.sendEmail(email);
	log.info("Entered email");
	Thread.sleep(1000);
	
	ep.SendCAddres(cAddress);
	log.info("Entered cAddress");
	Thread.sleep(1000);
	
	
	ep.SendPAddress(pAddress);
	log.info("Entered pAddress");
	Thread.sleep(1000);
	
	ep.clickSubmitBtn();
	log.info("clicked on submit button");
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
