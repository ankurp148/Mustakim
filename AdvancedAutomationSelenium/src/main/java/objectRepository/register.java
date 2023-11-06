package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register 
{
	public register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	@FindBy (xpath="//a[text()='Register']")
	private WebElement registerClick;

	@FindBy (id="gender-male")
	private WebElement genderClick;

	@FindBy (id="FirstName")
	private WebElement firstNameClick;

	@FindBy (id="LastName")
	private WebElement lastNameClick;

	@FindBy (id="Email")
	private WebElement emailClick;

	@FindBy (id="Password")
	private WebElement passwordClick;

	@FindBy (id="ConfirmPassword")
	private WebElement confirmPasswordClick;


	@FindBy (id="register-button")
	private WebElement registerButtonClick;


	public WebElement getRegisterClick() {
		return registerClick;
	}

	public WebElement getGenderClick() {
		return genderClick;
	}

	public WebElement getFirstNameClick() {
		return firstNameClick;
	}

	public WebElement getLastNameClick() {
		return lastNameClick;
	}

	public WebElement getEmailClick() {
		return emailClick;
	}

	public WebElement getPasswordClick() {
		return passwordClick;
	}

	public WebElement getConfirmPasswordClick() {
		return confirmPasswordClick;
	}

	public WebElement getRegisterButtonClick() {
		return registerButtonClick;
	}

}
