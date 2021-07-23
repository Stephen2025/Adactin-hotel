package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGloble {

	public static WebDriver driver;

	public static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	public void url(String url) {
		driver.get(url);

	}

	public static void login(WebElement element, String data) {

		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();

	}

	public void close() {
		driver.close();

	}

	public void clear() {
		driver.close();

	}

	public void selectbyVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

}