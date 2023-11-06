package addToBook;

import org.testng.annotations.Test;

import genricUtilities.BaseClass;

public class DWS_AddToCart_04_Test extends BaseClass
{
	@Test	(groups="IT")
	public void Verify_adding_the_gift_product_to_Cart()
	{
		book.getClickOnBook().click();
		book.getProductLink().click();
		book.getAddToCart().click();
	}
}
