package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToBook 
{
	public addToBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Book')]")
	private WebElement clickOnBook;

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	@FindBy (xpath="//a[contains(text(),'Computing and Internet')]")
	private WebElement productLink;

	public WebElement getClickOnBook() {
		return clickOnBook;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProductLink() {
		return productLink;
	}
	
}
