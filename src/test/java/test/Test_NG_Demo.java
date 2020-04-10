package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesGoogle.GoogleSearchPage;

public class Test_NG_Demo {

	private static WebDriver driver = null;

	 String browserName = null;

	@BeforeTest
	public void setupTest() {
		driver = new ChromeDriver();

	/*	if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "path");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.ghecko.driver", "");
			driver = new FirefoxDriver();
		}*/
	}

	@Test
	public void googelSearch() {

		driver.get("https://google.com");

		GoogleSearchPage.textbox_search(driver).sendKeys("step by step automation");

		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("driver completed successfully");
	}

}
