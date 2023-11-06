package addWishList;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_AddToWishList_09_Test extends BaseClass
{
	@Test
	
	public void Verify_the_price_filter() throws Throwable
	{
		
		addWishlist.getJewelryLink().click();
		
		addWishlist.getProductLink().click();
		
		addWishlist.getAddToWishlist().click();
		
		addWishlist.getWishlist().click();
		
		assertTrue(addWishlist.getProductWishlist().isDisplayed());
		
	}

}
