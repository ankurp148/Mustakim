package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToComapareList 
{
	public addToComapareList(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy (xpath="//a[contains(text(),'Computers')]")
	private WebElement computer1Link;

	@FindBy (xpath="(//a[contains(text(),'Desktops')])[4]")
	private WebElement desktop1Link;

	@FindBy (xpath="//a[contains(text(),'Build your own cheap computer')]")
	private WebElement desktop1Chose;

	@FindBy (xpath="//input[@value='Add to compare list']")
	private WebElement computerCompare1;

	@FindBy (xpath="//a[contains(text(),'Computers')]")
	private WebElement computer2Link;

	@FindBy (xpath="(//a[contains(text(),'Desktops')])[4]")
	private WebElement desktop2Link;

	@FindBy (xpath="//a[contains(text(),'Build your own expensive computer')]")
	private WebElement desktop2Chose;

	@FindBy (xpath="//input[@value='Add to compare list']")
	private WebElement computerComare2;

	public WebElement getComputer1Link() {
		return computer1Link;
	}

	public WebElement getDesktop1Link() {
		return desktop1Link;
	}

	public WebElement getDesktop1Chose() {
		return desktop1Chose;
	}

	public WebElement getComputerCompare1() {
		return computerCompare1;
	}

	public WebElement getComputer2Link() {
		return computer2Link;
	}

	public WebElement getDesktop2Link() {
		return desktop2Link;
	}

	public WebElement getDesktop2Chose() {
		return desktop2Chose;
	}

	public WebElement getComputerComare2() {
		return computerComare2;
	}


}
