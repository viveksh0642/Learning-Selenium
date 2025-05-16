package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertequals {

	@Test
	public void launchGooglePage() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // auto-downloads correct driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Login attempted");

		Thread.sleep(5000);
		
		boolean element =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/div/button")).isDisplayed();

		String actualURL = driver.getCurrentUrl();

		String loginpageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		// Assert.assertEquals(actualURL, expectedURL);

		//Assert.assertNotEquals(actualURL, loginpageURL);
		
		Assert.assertTrue(element);
	}

}
