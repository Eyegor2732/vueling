package com.vueling.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

//	static ExtentReports report;

	public static ExtentReports getReportObject() {
		String userDir = System.getProperty("user.dir");
		String reportPath = userDir + "/reports/extent_report.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("WEB Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Eyegor");
//		report.createTest(reportPath);
		
		return report;
	}
}
