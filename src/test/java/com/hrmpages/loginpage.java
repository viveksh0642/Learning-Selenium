package com.hrmpages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.test.basetest;
import com.report.ExtentReportUtilis;

//import freemarker.log.Logger;

public class loginpage {

	@FindBy(name = "username")
	WebElement usernameTextBox;

	@FindBy(name = "password")
	WebElement passwordTextBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	public loginpage() {

		PageFactory.initElements(basetest.driver, this);
	}

	Logger log = LogManager.getLogger(loginpage.class);

	public void loginToApplication(String username, String password) {

		usernameTextBox.sendKeys(username);
		log.info("Username is Entered in username text box");
		ExtentReportUtilis.addStep("Username is Entered");

		passwordTextBox.sendKeys(password);
		log.info("Password is Entered in Password text box");
		ExtentReportUtilis.addStep("Password value is Entered in text box");

		loginBtn.click();
		log.info("Loggin Button is Clicked");
		ExtentReportUtilis.addStep("Login btn is Clicked.");

	}

}
