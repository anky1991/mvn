package MPLLC.TrackThat;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_Page_Locator extends TestBase
{
//Page factory -OR:--Class Object Initialization throw page factory method.
public Login_Page_Locator()
{
	PageFactory.initElements(driver, this);
    System.out.println("driver in POM"+"  "+ driver);
}

@FindBy(css="input[placeholder='Enter User ID here ']")
private WebElement emailidTF; 

public WebElement getEmailID() 
{
	return emailidTF;
}

@FindBy(id="swordCng") private WebElement passwordTF;
public WebElement getPassword() 
{
	return passwordTF;
}

@FindBy (css="select[ng-model='lc.roleDropDownLogin']") private WebElement slctBtn;
public WebElement getselectlist()
{
	return slctBtn;
}

@FindBy (css="img.changeReme")
private WebElement remCB; public WebElement getRemembercheck() 
{
	return remCB;
}

@FindBy(xpath="//button[text()='LOGIN']") private WebElement loginBtn;
public WebElement getLoginBTN()
{
	return loginBtn;
}

@FindBy(id="nav_list") private WebElement hmbrgrIcon;
public WebElement getHambrgrICon(){
{
	return hmbrgrIcon;
}
}

@FindBy(id="logoutButtonXmpp") private WebElement logoutBTN;
public WebElement getLogoutBtn()
{
	return logoutBTN;
}

@FindBy(xpath="(//div[@class='modal-content'])[2]/div/p") private WebElement uidtext;
public WebElement getUiDText()
{
	return uidtext;
}

@FindBy(css="button.customButtonClass") private WebElement OkBTN;
public WebElement getOkBtn()
{
	return OkBTN;
}
}



