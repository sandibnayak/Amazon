package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amz_utility {

	static WebDriver driver;
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDIB KUMAR NAYAK\\"
				+ "eclipse-workspace\\New\\AmazonIn\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void loadUrl(String enter_url) {
		driver.get(enter_url);
	}

	public static void quitBrowser() {
		driver.quit();
	}
	
	
	public static void insertText(WebElement element_ref, String entertext) {
		element.sendKeys(entertext);
	}
	
	public static void insertTextInCaps(WebElement element, CharSequence entertext) {
		acc=new Actions(driver);
		acc.keyDown(element, Keys.SHIFT).sendKeys(element,entertext).keyUp(element,Keys.LEFT_SHIFT).perform();
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
//*****************************************************************
	
	
}
