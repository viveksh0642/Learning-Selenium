package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class timesheet {

    @BeforeClass
    public void setUp() {
       // parametersclassdemo.initializeDriver();
    }

    @Test
    public void verifyTimesheetSubmission() {

        // Navigate to Timesheet page
        parametersclassdemo.driver.findElement(By.linkText("Timesheet")).click(); // Update with correct link text

        // Enter employee name
        parametersclassdemo.driver.findElement(
            By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']/input")
        ).sendKeys("John");

        // Click the submit button
        parametersclassdemo.driver.findElement(
            By.cssSelector("button.orangehrm-left-space")
        ).click();
    }

  
  //  public void tearDown() {	
      //  parametersclassdemo.quitDriver();
    }
