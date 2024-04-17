package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPOMClass 
{
   WebDriver driver;
  //  ElementsCard web element
 @FindBy (xpath="(//div[@class='card-up'])[1]")private WebElement elementsCard;
  public void clickElementsCard()
  {
	  elementsCard.click(); 
  }
  
//  #####   Text Box Elements  #####
  
  @FindBy(xpath="//span[text()='Text Box']")WebElement textBoxElement;
  public void clickOnTextBox()
  {
	  textBoxElement.click();
  }
  
//  full name
  @FindBy(xpath="//input[@id='userName']")WebElement fullname;
  public void sendFullName(String fullName)
  {
	fullname.sendKeys(fullName);  
  }
  
//  Email
  
  @FindBy(xpath="//input[@id='userEmail']")WebElement userEmail;
  public void sendEmail(String email)
  {
	  userEmail.sendKeys(email);
  }
  
//  Current Address
  
  @FindBy(xpath="//textarea[@id='currentAddress']")WebElement currentAddress;
  public void SendCAddres(String cAddress)
  {
	  currentAddress.sendKeys(cAddress);
  }
  
//  Permanent Address
  @FindBy(xpath="//textarea[@id='permanentAddress']")WebElement permanentAddress ;
  public void SendPAddress(String pAddress)
  {
	  permanentAddress.sendKeys(pAddress);
  }
  
//  Submit Button
  @FindBy(xpath="//button[text()='Submit']")WebElement submitBtn;
  public void clickSubmitBtn()
  {
	  submitBtn.click();
  }
  
  
  
  public ElementsPOMClass(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
}
