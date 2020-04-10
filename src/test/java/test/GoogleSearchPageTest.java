package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesGoogle.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearchText();
	}

	public static void googleSearchText() {
		driver = new ChromeDriver();

		GoogleSearchPageObjects searchPageobj = new GoogleSearchPageObjects(driver);

		driver.get("https://google.com");
		searchPageobj.setTexinSearchBox("abcd");
		
		searchPageobj.clickSearchbox();
		
		driver.close();
	}

}
