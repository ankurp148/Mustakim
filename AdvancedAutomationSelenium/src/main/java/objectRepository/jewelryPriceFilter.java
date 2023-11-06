package objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jewelryPriceFilter 
{
	public jewelryPriceFilter(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="(//a[contains(text(),'Jewelry')])[3]")
	private WebElement jewelryLink;
	
	@FindBy (xpath="//span[text()='0.00']")
	private WebElement filterLink;
	
	@FindBy (xpath="//div[@class='prices']")
	private List<WebElement> pricelink;

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getFilterLink() {
		return filterLink;
	}	

	public List<WebElement> getPricelink() {
		return pricelink;
	}	
}
