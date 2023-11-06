package genricUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	WebDriver driver;
	JavascriptExecutor jse;

	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
		jse = (JavascriptExecutor) driver;
	}

	/**
	 * THIS METHOD IS USED TO CLICK ON ELEMENT USING JAVASCRIPT EXECUTOR
	 * 
	 * @param element
	 * @param data    which is used to enter the element
	 */

	public void clickOnElement(WebElement element) {
		jse.executeScript("arguments[0].click();", element);
	}

	public void enteringDataIntoElement(WebElement element, String data) {
		jse.executeScript("arguments[0].value='" + data + "'", element);
	}

	/**
	 * THIS METHOD RETURNS THE REFERENCE OF EXPLICIT WAIT
	 * 
	 * @param TIME TO TIME
	 * @return WAIT
	 */

	public WebDriverWait explicitWaitReference(int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait;
	}

	/**
	 * THIS METHOD WILL RETURNS REFERENCE OF ACTION
	 * 
	 * @return ACTION
	 */

	public Actions actionsReference() {
		Actions action = new Actions(driver);
		return action;
	}

	public void handlingDropDown(WebElement element, String value) {
		Select select = new Select(element);
		try {
			select.selectByVisibleText(value);
		} catch (NoSuchElementException e1) {
			try {
				select.selectByValue(value);
			} catch (Exception e) {
				int val = Integer.parseInt(value);
				select.selectByIndex(val);
			}
		}
	}

	/**
	 * This method is used to perform scrollBy action
	 * 
	 * @param x
	 * @param y
	 */
	public void scrollByAction(int x, int y) {
		jse.executeScript("window.scrollBY(" + x + "," + y + ")");
	}
	/**
	 * this method is used to scroll to the element to increase the element
	 * visibility if the status is true the window will scroll untill the element
	 * reaches the top if the status is false the window will scroll untill the
	 * element reaches the buttom
	 * 
	 * @param
	 * @param status
	 */
	public void scrollIntoViewAction(WebElement element, Boolean status) {
		jse.executeScript("arguments[0].scrollIntoView(" + status + ")", element);
	}

	/**
	 * This method is used to perform scrollTo action
	 * 
	 * @param x
	 * @param y
	 */
	public void scrollToAction(int x, int y) {
		jse.executeScript("window.scrollTo(" + x + "," + y + ")");
	}

	/**
	 * THIS METHOD USED TO SWITCH THE DRIVER CONTROL FROM WINDOW TO FRAME
	 * 
	 * @param index
	 */

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * THIS METHOD USED TO SWITCH THE DRIVER CONTROL FROM WINDOW TO FRAME
	 * 
	 * @param index
	 */

	public void switchToFrame(String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * THIS METHOD USED TO SWITCH THE DRIVER CONTROL FROM WINDOW TO FRAME
	 * 
	 * @param element
	 */

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * THIS METHOD USED TO SWITCH THE DRIVER CONTROL FROM FRAME TO WINDOW
	 */

	public void switchBackToMainWindow() {
		driver.switchTo().defaultContent();
	}

	/**
	 * THIS METHOD IS RETURNING THE ALERT REFERENCE
	 * 
	 * @return
	 */
	public Alert returnAlertReference() {

		// driver.switchTo().alert();
		return driver.switchTo().alert();
	}

	/**
	 * THIS METHOD IS USED TO SWITCH FROM ONE WINDOW TO ANOTHER WINDOW
	 * 
	 * @param allWindowID
	 * @param expectedTitle
	 * @param parentID
	 */

	public void switchingToWindow(Set<String> allWindowID, String expectedTitle, String parentID) {
		allWindowID.remove(parentID);
		for (String id : allWindowID) {
			driver.switchTo().window(id);
			if (expectedTitle.contains(driver.getTitle())) {
				break;
			}
		}
	}

	/**
	 * THIS METOD IS USED TO SWITCH THE CONTROL TO PARENT WINDOW
	 * 
	 * @param parentID
	 */
	public void switchingBackToMainWindow(String parentID) {
		driver.switchTo().window(parentID);
	}

}
