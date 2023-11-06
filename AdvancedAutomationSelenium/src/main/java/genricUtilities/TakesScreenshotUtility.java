package genricUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotUtility {
	/**
	 * THIS CLASS IS TO TAKE SCREENSHOT OF WEBPAGE AND WEB ELEMENT
	 */
	WebDriver driver;
	TakesScreenshot ss;

	public TakesScreenshotUtility(WebDriver driver) {
		this.driver = driver;
		ss = (TakesScreenshot) this.driver;
	}

	public String capturingScreenshot(String screenshotName) {
		File photo = ss.getScreenshotAs(OutputType.FILE);
		String time = LocalDateTime.now().toString().replace(':', '-');
		String directory = System.getProperty("user.dir");
		String path = "" + directory + "./target/ERRORSHOTS/" + screenshotName + " " + time + ".png";
		File destination = new File(path);
		try {
			FileHandler.copy(photo, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

}
