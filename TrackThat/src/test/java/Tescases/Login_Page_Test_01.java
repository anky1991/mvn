package Tescases;

import org.testng.annotations.Test;
import MPLLC.TrackThat.Login_Page_Locator;
import MPLLC.TrackThat.Selenium_Utility;
import MPLLC.TrackThat.TestBase;

import org.testng.annotations.BeforeMethod;

public class Login_Page_Test_01 extends TestBase
    {
    
	TestBase tb ;
    Login_Page_Locator lpl ;
	Selenium_Utility su;
	
	public Login_Page_Test_01()
    {
		super();
	}
    
	@BeforeMethod
	public void initConfig() 
	{
		tb=new TestBase();
        tb.invokeBrowser(prop.getProperty("Browser"));
        lpl =new Login_Page_Locator();  
	}
	/*@Test
	public void validateUserIdRequiredText() throws InterruptedException 
	{
		su.clickAnElement(lpl.getLoginBTN());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElement(lpl.getUiDText(), "User ID is required!"));
		Assert.assertEquals(lpl.getUiDText().getText(), "User ID is required!");
		su.clickAnElement(lpl.getOkBtn());
	}

	//@Test(dependsOnMethods = {"validateUserIdRequiredText"})
	@Test
	public void validatePasswordRequiredText() throws InterruptedException
	{
		su.enterContentInto(lpl.getEmailID(), "testme@m.com");
		Thread.sleep(1000);
		su.clickAnElement(lpl.getLoginBTN());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElement(lpl.getUiDText(), "Password is required!"));
		AssertJUnit.assertEquals(lpl.getUiDText().getText(), "Password is required!");
		su.clickAnElement(lpl.getOkBtn());
	}

	//@Test(dependsOnMethods = { "validatePasswordRequiredText" }, dataProvider = "getData")
	@Test
	public void validateEnteringUserCredentials(String Uname, String Pwd) throws InterruptedException 
	{
		
		 * su.clearTextField(lpl.getEmailID());
		 * su.enterContentInto(lpl.getEmailID(),dp.getProperty("UserName"));
		 * su.enterContentInto(lpl.getPassword(),dp.getProperty("Password"));
		 * su.selectAnElement(lpl.getselectlist(),"3");
		 * su.clickAnElement(lpl.getRemembercheck());
		 * su.clickAnElement(lpl.getLoginBTN());
		 
		su.clearTextField(lpl.getEmailID());
		su.enterContentInto(lpl.getEmailID(), Uname);
		Thread.sleep(1000 * 3);
		su.enterContentInto(lpl.getPassword(), Pwd);
		Thread.sleep(1000 * 3);
		su.selectAnElement(lpl.getselectlist(), "3");
		su.clickAnElement(lpl.getRemembercheck());
		Thread.sleep(1000 * 3);
		su.clickAnElement(lpl.getLoginBTN());
		Thread.sleep(1000 * 3);
		su.clickAnElement(lpl.getOkBtn());
	}*/
	@Test
	public void loginSuperadmin() 
	{
		System.out.println("driver in test testcase" +" " + driver);
		su.clickAnElement(lpl.getEmailID());
		su.clearTextField(lpl.getEmailID());
		su.clickAnElement(lpl.getPassword());
		su.clearTextField(lpl.getPassword());
		su.enterContentInto(lpl.getEmailID(), prop.getProperty("UserName"));
		su.enterContentInto(lpl.getPassword(), prop.getProperty("Password"));
		su.selectAnElement(lpl.getselectlist(), "3");
		su.clickAnElement((lpl.getLoginBTN()));
	}

/*	@DataProvider
	public Object[][] getData() 
	{
		Object[][] arr = new Object[3][2];
		arr[0][0] = "test@m.com";
		arr[0][1] = "aaaaaa";
		arr[1][0] = "pes@g.com";
		arr[1][1] = "bbbb";
		arr[2][0] = "f@a.com";
		arr[2][1] = "ttttt";
		return arr;
	}*/
}
