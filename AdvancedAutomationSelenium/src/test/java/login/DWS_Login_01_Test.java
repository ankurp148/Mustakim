package login;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricUtilities.BaseClass;
import genricUtilities.ExcelUtility;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass
{
	@Test (dataProvider = "data", dataProviderClass = ExcelUtility.class)
	public void Login_to_application_with_valid_credentials(String username, String password)
	{
		loginpage.getLoginlink().click();
		logger.log(Status.INFO,"USER CLICK");
		loginpage.getEmailTF().sendKeys(username);
		logger.log(Status.INFO,"USER ENTER USERNAME");
		loginpage.getPasswordTF().sendKeys(password);
		logger.log(Status.INFO,"USER ENTER PASSWORD");
		loginpage.getLoginButton().click();
	}

}
