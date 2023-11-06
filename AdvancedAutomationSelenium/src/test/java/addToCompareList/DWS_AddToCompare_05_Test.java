package addToCompareList;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_AddToCompare_05_Test extends BaseClass
{
	@Test
	
	public void Verify_adding_two_desktop_to_cart_and_compare()
	{
		compareList.getComputer1Link().click();
		
		compareList.getDesktop1Link().click();
		
		compareList.getDesktop1Chose().click();
		
		compareList.getComputerCompare1().click();
			
		compareList.getComputer2Link().click();
		
		compareList.getDesktop1Link().click();
		
		compareList.getDesktop2Chose().click();
		
		compareList.getComputerComare2().click();
		
		assertTrue(compareList.getDesktop1Chose().isDisplayed());
		assertTrue(compareList.getDesktop2Chose().isDisplayed());
	}
}
