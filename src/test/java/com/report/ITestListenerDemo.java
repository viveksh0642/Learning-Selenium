package com.report;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportUtilis.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		ExtentReportUtilis.flushReport();

	}
}
