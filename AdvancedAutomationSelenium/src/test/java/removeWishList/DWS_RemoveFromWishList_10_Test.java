package removeWishList;

	import static org.testng.Assert.assertTrue;

	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import genricUtilities.BaseClass;
	import genricUtilities.ITestListenerUtility;

	@Listeners(ITestListenerUtility.class)

	public class DWS_RemoveFromWishList_10_Test extends BaseClass
	{
		@Test
		
		public void Remove_Product_Wishlist() throws Throwable 
		{
			Thread.sleep(1500);
			removeWishlist.getJewelryLink().click();
			Thread.sleep(1500);
			removeWishlist.getProductLink().click();
			Thread.sleep(1500);
			removeWishlist.getAddToWishlist().click();			
			Thread.sleep(4000);			
			removeWishlist.getWishlist().click();		
			Thread.sleep(1500);
            removeWishlist.getClickCheckbox().click();
            Thread.sleep(1500);
			removeWishlist.getUpdateWishlist().click();
			
		}

	}
