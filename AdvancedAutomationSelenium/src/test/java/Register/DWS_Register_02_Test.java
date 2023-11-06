package Register;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Register_02_Test extends BaseClass
{
	@Test
	public void Register_user()
	{
		register.getRegisterClick().click();
		
		register.getGenderClick().click();
		
		register.getFirstNameClick().sendKeys("Ankur");
		
		register.getLastNameClick().sendKeys("Prajapati");
		
		register.getEmailClick().sendKeys("ankurp1481995@gmail.com");
		
		register.getPasswordClick().sendKeys("ankur148");
		
		register.getConfirmPasswordClick().sendKeys("ankur148");
		
		register.getRegisterButtonClick().click();
		
	}

}
