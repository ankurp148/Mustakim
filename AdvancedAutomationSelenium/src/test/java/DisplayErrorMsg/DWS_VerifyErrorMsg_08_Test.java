package DisplayErrorMsg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_VerifyErrorMsg_08_Test extends BaseClass
{
	@Test	public void Verify_the_error_message() throws Throwable
	{
		verifyError.getProductLink().click();
		
		Thread.sleep(3000);
		
		verifyError.getEmailFriendLink().click();
		
		verifyError.getFriendMailTextField().sendKeys("ankurp@gmail.com");
		
		verifyError.getYourMailTextField().sendKeys("ankit@gmail.com");
		
		verifyError.getSendEmailClick().click();
		
		assertTrue(verifyError.getErrorMsg().isDisplayed());
		
	}

}
