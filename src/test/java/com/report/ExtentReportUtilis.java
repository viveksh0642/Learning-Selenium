package com.report;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
// com.utility.TakeScreenshot;
import com.hrm.test.basetest;

public class ExtentReportUtilis {

	
	public static ExtentTest test;
	 
	public static ExtentReports report;
	
	public static void setupreport() {
		
		report= new ExtentReports();
		ExtentSparkReporter spark =  new ExtentSparkReporter("report/execution.html");
		report.attachReporter(spark);
		
	}
	
	public static void createTest(String testName) {
		
		test =report.createTest(testName);
	}

	
	public static void addStep(String stepMessage) {
		
		test.info(stepMessage, MediaEntityBuilder.createScreenCaptureFromBase64String(captureScreenshot()).build());
		}
	
	public static String captureScreenshot() {
		
		//TakesScreenshot screenshot = (TakeScreenshot) basetest.driver;
		
		TakesScreenshot screenshot = (TakesScreenshot) basetest.driver;

		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		byte[] fileContent = null;
		try {
			fileContent	= FileUtils.readFileToByteArray(file);
			
		} catch (IOException e) {
			
		}
		
		String str = Base64.getEncoder().encodeToString(fileContent);
		System.out.println(str);
		
		return str;
	}
	
	public static void flushReport() {
		
		report.flush();
	}
}

