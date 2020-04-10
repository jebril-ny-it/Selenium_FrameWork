package pagesGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;

	By textbox_search_ = By.name("q");
	By button_search = By.name("q");

	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void setTexinSearchBox(String text) {
		driver.findElement(textbox_search_).sendKeys(text);
	}

	public void clickSearchbox() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}

}
