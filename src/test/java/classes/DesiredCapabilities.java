package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilities {

	public static void main(String[] args) {

	
		WebDriver driver = new ChromeDriver();

		//go to github==TO GET ALL CHROME DESIRED CAPABILITIES
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//start-maximized
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.quit();
		
	}

}
