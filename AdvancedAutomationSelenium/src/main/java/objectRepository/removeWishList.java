package objectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class removeWishList 
	{
		public removeWishList(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		@FindBy (xpath="(//a[contains(text(),'Jewelry')])[3]")
		private WebElement jewelryLink;
		
		@FindBy (xpath="//a[text()='Black & White Diamond Heart']")
		private WebElement productLink;
		
		@FindBy (xpath="//input[@id='add-to-wishlist-button-14']")
		private WebElement addToWishlist;
		
		@FindBy (xpath="//span[text()='Wishlist']")
		private WebElement wishlist;
		
		@FindBy (xpath="//a[text()='Black & White Diamond Heart']")
		private WebElement productWishlist;
		
		@FindBy (xpath="//input[@type='checkbox']")
		private WebElement clickCheckbox;
		
		@FindBy (xpath="//input[@value='Update wishlist']")
		private WebElement updateWishlist;
		
		
		public WebElement getJewelryLink() {
			return jewelryLink;
		}

		public WebElement getProductLink() {
			return productLink;
		}

		public WebElement getAddToWishlist() {
			return addToWishlist;
		}
		
		public WebElement getProductWishlist() {
			return productWishlist;
		}

		public WebElement getWishlist() {
			return wishlist;
		}

		public WebElement getClickCheckbox() {
			return clickCheckbox;
		}

		public WebElement getUpdateWishlist() {
			return updateWishlist;
		}

	}
