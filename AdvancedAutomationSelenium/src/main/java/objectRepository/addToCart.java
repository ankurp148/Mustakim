package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart 
{
	public addToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	@FindBy (xpath="//a[contains(text(),'$25 Virtual Gift Card')]")
	private WebElement productLink;

	public WebElement getaddToCart() {
		return addToCart;
	}
	
	public WebElement getProductLink() {
		return productLink;
	}

}
