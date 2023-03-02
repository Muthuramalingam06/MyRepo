package org.Utility;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.externalconfig.model.Config;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReport {
	static ExtentHtmlReporter ex;
	static ExtentReports rep;
	public static void StartReport() {
		ex = new ExtentHtmlReporter("C:\\Users\\WIN\\eclipse-workspace\\AutoMutaul\\src\\test\\resources\\ExtentsReport.report.html");
		ex.config().setTheme(Theme.DARK);
		ex.config().setReportName("Altro Mutual");
		ex.config().setDocumentTitle("TestNG extents report");
		
		rep = new ExtentReports();
		rep.attachReporter(ex);
		rep.setSystemInfo("OS", "Windows10");
		rep.setSystemInfo("Environment", "QA");
		rep.setSystemInfo("Sprint", "12");
		
		
	}
   public static void createReport(ITestResult sc) {
	   String name = sc.getName();
	   int status = sc.getStatus();
		switch (status) {
		case 1:
			rep.createTest(name).pass("Test is passed");
			break;
       case 2:
    	   rep.createTest(name).pass("Test is Failed");
			break;	

		default:
			rep.createTest(name).skip("Test is Skipped");
			break;
		}
	}
   public static void EndReport() {
		rep.flush();
 	}


}
