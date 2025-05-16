package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametersclassdemo {
	
	public static WebDriver driver;

	// WebDriver driver; // <-- class-level WebDriver

	
	@Parameters({"userName", "password"})
	@Test(priority = 1)
	public void loginToApplication( @Optional ("SuperAdmin") String userName, String password ) throws InterruptedException {
		//public static void initializeDriver()
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000); // not recommended, but okay for now

		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Login attempted");
	}

}
