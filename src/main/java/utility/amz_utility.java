package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
//*****************************************************************
	
	
}
