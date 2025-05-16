package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderdemo {
	WebDriver driver; // <-- class-level WebDriver

	@Test(priority = 1, dataProvider = "getTestData")
	public void loginToApplication(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000); // not recommended, but okay for now

		driver.findElement(By.name("username")).sendKeys("username ");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Login attempted"); 
		
}

	@DataProvider
	public Object [] [] getTestData(){
		
		Object [] [] data = new Object [2] [2];
		
		data [0] [0] = "Admin";
		data [0] [1] = "admin123";
		data [1] [0] = "superAdmin";
		data [1] [1] = "Admin123";
		
		return data;
	}
	
	
}
