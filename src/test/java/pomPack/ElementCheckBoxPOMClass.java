package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementCheckBoxPOMClass 
{
WebDriver driver;

@FindBy(xpath="//span[text()='Check Box']")WebElement elementCheckBox;
public void clickElementCheckBox()
{
	elementCheckBox.click();
}


@FindBy(xpath="//span[@class='rct-title']")WebElement checkBox;
public void clickCheckBox()
{
	checkBox.click();
}

@FindBy(xpath="//span[@class='rct-title']")WebElement isSelectcheckBox;
public boolean isSelectedCheckBox()
{
	boolean isselect = isSelectcheckBox.isSelected();
	return isselect;
}



public ElementCheckBoxPOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

}
