package com.hrm.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.report.ExtentReportUtilis;

public class basetest {

	public static WebDriver driver;

	@BeforeSuite
	public void initDriver() {

		ExtentReportUtilis.setupreport();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
