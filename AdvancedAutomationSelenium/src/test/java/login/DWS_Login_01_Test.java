package login;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass
{
	@Test
	public void Login_to_application_with_valid_credentials()
	{
		loginpage.getLoginlink().click();
		logger.log(Status.INFO,"USER CLICK");
		loginpage.getEmailTF().sendKeys("ankurp1481995@gmail.com");
		logger.log(Status.INFO,"USER ENTER USERNAME");
		loginpage.getPasswordTF().sendKeys("ankurp148");
		logger.log(Status.INFO,"USER ENTER PASSWORD");
		loginpage.getLoginButton().click();
	}

}
