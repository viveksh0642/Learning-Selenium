package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class listenerdemo {
	
	ChromeDriver driver;
	
	@Test
	public void login() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				 
		
		
	}

	@Test
	public void testAdmin() {
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	boolean isDisplayedStatus =	driver.findElement(By.xpath("//h5[text(='System Users']")).isDisplayed();
		Assert.assertTrue(isDisplayedStatus);
		
	}
	
	@Test
	public void logout() {
		
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
}
