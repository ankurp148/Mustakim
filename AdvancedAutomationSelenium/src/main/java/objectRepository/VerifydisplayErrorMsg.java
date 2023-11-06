package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifydisplayErrorMsg 
{
	public VerifydisplayErrorMsg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//a[contains(text(),'$25 Virtual Gift Card')]")
	private WebElement productLink;

	@FindBy (xpath="//input[@value='Email a friend']")
	private WebElement emailLink;

	@FindBy (id="FriendEmail")
	private WebElement friendMailTextField;

	@FindBy (id="YourEmailAddress")
	private WebElement yourMailTextField;

	@FindBy (xpath="//input[@value='Send email']")
	private WebElement sendEmailClick;
	
	@FindBy (xpath="//div[@class='message-error']/child::div/child::ul/child::li")
	private WebElement errorMsg;

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getEmailFriendLink() {
		return emailLink;
	}

	public WebElement getFriendMailTextField() {
		return friendMailTextField;
	}

	public WebElement getYourMailTextField() {
		return yourMailTextField;
	}

	public WebElement getSendEmailClick() {
		return sendEmailClick;
	}

}
