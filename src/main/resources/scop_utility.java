import org.openqa.selenium.WebDriver;

public class scop_utility {

	static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/AmazonIn/Driver/chromedriver.exe";
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
	
	
}
