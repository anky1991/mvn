package MPLLC.TrackThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Utility extends TestBase
{
	
	public void enterContentInto(WebElement ele, String content)
	{
		ele.sendKeys(content);
	}
	
	public void selectAnElement(WebElement ele1,String a)
	{
		Select slct=new Select(ele1);
		slct.selectByValue(a);
	}
	
	public void clickAnElement(WebElement ele2)
	{
		ele2.click();
	}
	
	public void getTextMethod(WebElement ele3)
	{
		ele3.getText();
	}
    public void clearTextField(WebElement ele4)
    {
    	ele4.clear();
    }
	
    public void wait(WebElement ele4)
    {
    	WebDriverWait wb =new WebDriverWait(driver, 20);
    	wb.until(ExpectedConditions.textToBePresentInElement(ele4, "User ID is required!"));
    }
}
