package Utlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get(DataFiles.url());
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();

	} 
}
