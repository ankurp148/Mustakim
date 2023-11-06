package jewelryPriceFilter;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilities.BaseClass;
import genricUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_JewelryPriceFilter_07_Test extends BaseClass
{
	@Test
	
	public void Verify_the_price_filter() throws Throwable
	{
	
		price.getJewelryLink().click();
		
		price.getFilterLink().click();
		
		List<WebElement> allPrize = driver.findElements(By.xpath("//div[@class='prices']"));
		
		 for (WebElement p:allPrize)
		{
			String a1=p.getText().substring(0,3);
			int val = Integer.parseInt(a1);
			if (val<=500)
			{
				System.out.println("TEST CASE IS PASSED :"+p.getText());
				
			}
			else
			{
				System.out.println("TEST CASE IS FAILED");
			}
		}
		
	}

}
