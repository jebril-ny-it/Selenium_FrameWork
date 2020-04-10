package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportsBasicDemo {

	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendreports.html");
	
		ExtentReports exten = new ExtentReports();
		exten.attachReporter(htmlReporter);
	
	
	
	
	}

}
