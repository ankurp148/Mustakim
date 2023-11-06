package addToCart;

import org.testng.annotations.Test;

import genricUtilities.BaseClass;

public class DWS_AddToCart_03_Test extends BaseClass
{
	@Test	(groups="IT")
	public void Verify_adding_the_gift_product_to_Cart()
	{
		cart.getProductLink().click();
		cart.getaddToCart().click();
	}
}
