package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmtestcases {

	WebDriver driver; // <-- class-level WebDriver

	@Test(priority = -4)
	public void loginToApplication() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000); // not recommended, but okay for now

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Login attempted");
	}

	@Test(priority = -2)
	public void searchLeave() throws InterruptedException {
		Thread.sleep(5000); // wait for page to load or use WebDriverWait
		driver.findElement(By.xpath("//span[text()='Leave']/ancestor::a")).click();
		//Thread.sleep(5000);
		// System.out.println("Leave tab clicked");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div")).sendKeys("john");
	//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div")).sendKeys("john");

	}

	@Test(priority = 3)
	public void logout() {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Logout")).click();

	}

	@Test(priority = 4)
	public void closedBrowser() {
		driver.close();

	}

}
