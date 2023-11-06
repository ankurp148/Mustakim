package genricUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.VerifydisplayErrorMsg;
import objectRepository.addToBook;
import objectRepository.addToCart;
import objectRepository.addToComapareList;
import objectRepository.addWishList;
import objectRepository.jewelryPriceFilter;
import objectRepository.register;
import objectRepository.removeToCompareList;
import objectRepository.removeWishList;

public class BaseClass implements IAutoConstants
{
	static DataBaseUtility dbUtility;
	static JavaUtility javaUtility;
	static PropertyUtility property;
    public static ExtentTest logger;
	public static WebDriver driver;
	public static TakesScreenshotUtility screenshot;
	public static WebDriverUtility webDriverUtility;
	public static LoginPage loginpage;
    public static addToComapareList compareList;
    public static removeToCompareList removeProduct;
	public static VerifydisplayErrorMsg verifyError;
    public static register register;
    public static addToCart cart ;
    public static addToBook book;
    public static addWishList addWishlist;
    public static removeWishList removeWishlist;
    public static jewelryPriceFilter price;
    
    
	@BeforeClass (alwaysRun = true)
	public static void demo() {
		property = new PropertyUtility();
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);			
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		webDriverUtility = new WebDriverUtility(driver);
		screenshot = new TakesScreenshotUtility(driver);
		dbUtility = new DataBaseUtility();
		javaUtility = new JavaUtility();
		
		loginpage=new LoginPage(driver);
		compareList = new addToComapareList(driver);
		removeProduct = new removeToCompareList(driver);
	    verifyError = new VerifydisplayErrorMsg(driver);
	    register = new register(driver);
	    cart = new addToCart(driver);
	    book = new addToBook(driver);
	    addWishlist = new addWishList(driver);
	    removeWishlist = new removeWishList(driver);
	    price = new jewelryPriceFilter(driver);
	}

	@BeforeMethod (alwaysRun = true)
	public void loginToApplication() {
		System.out.println("LOGGED INTO APPLICATION");
	}

	@AfterMethod (alwaysRun = true)
	public void logoutFromApplication() {
		System.out.println("LOGGED OUT FROM APPLICATION");
	}

	@AfterClass (alwaysRun = true)
	public void tearDownTheBrowser() // closing the browser
	{
		driver.quit();
	}

}