package com.hrmpages;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.test.basetest;
import com.report.ExtentReportUtilis;

//import freemarker.log.Logger;

public class HOMEPAGE {

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	WebElement Adminlink;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/img")
	WebElement Profilimage;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	WebElement Logout;

	public  HOMEPAGE() {

		PageFactory.initElements(basetest.driver, this);

	}
	
	Logger log =  LogManager.getLogger(HOMEPAGE.class);

	public void clickonAdminlink() {
		Adminlink.click();
		log.info("Admin link is clicked");

	}

	public void Logout() {
		Profilimage.click();
		log.info("Profile icon is Clicked");
		ExtentReportUtilis.addStep("Profile icon is Clicked.");
		
		Logout.click();
		log.info("Logout link is Clicked");
		ExtentReportUtilis.addStep("Logout link is clicked.");

	}
}
