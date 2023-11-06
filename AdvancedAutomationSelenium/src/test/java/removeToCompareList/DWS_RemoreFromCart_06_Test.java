package removeToCompareList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_RemoreFromCart_06_Test extends BaseClass
{
	@Test
	
	public void Verify_remove_two_desktop_from_cart() throws Throwable
	{
		removeProduct.getComputer1Link().click();
		
		removeProduct.getDesktop1Link().click();
		
		removeProduct.getDesktop1Chose().click();
		
		removeProduct.getComputerCompare1().click();
			
		removeProduct.getComputer2Link().click();
		
		removeProduct.getDesktop1Link().click();
		
		removeProduct.getDesktop2Chose().click();
		
		removeProduct.getComputerComare2().click();
		
		removeProduct.getRemoveProduct1().click();
		
		Thread.sleep(3000);
		
	    removeProduct.getRemoveProduct2().click();
		
	}
}
