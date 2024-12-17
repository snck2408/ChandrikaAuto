package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentUtilty
{
	public ExtentSparkReporter sparkrep;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;
	
	
	
	public void onStart(ITestContext context) {
	    // not implemented
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		 repName = "Test-Report-" + timeStamp + ".html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report

		sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of report
		sparkReporter.config().setReportName("opencart Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "opencart");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("Sub Module", "Customers");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environemnt", "QA");
		
		String os = context.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		
		String browser = context.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups = context.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
		extent.setSystemInfo("Groups", includedGroups.toString());
		}
		
	  }
	public  void onTestStart(ITestResult result) {
	    // not implemented
	  }
	
	
	  public void onTestSuccess(ITestResult result) {
		  test = extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups()); // to display groups in report
			test.log(Status.PASS,result.getName()+" got successfully executed");
		    // not implemented
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  test = extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups()); // to display groups in report
			test.log(Status.SKIP,result.getName()+" got skipped");
		    // not implemented
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  test = extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups()); // to display groups in report
			test.log(Status.FAIL,result.getName()+" Failed");
		    // not implemented
		  }
	  
	   public void onFinish(ITestContext context) {
			extent.flush();

			String pathOfExtentReport = System.getProperty("user.dir")+"\\src\\test\\java\\Reports"+repName;
			File extentReport = new File(pathOfExtentReport);
			
			try {
				Desktop.getDesktop().browse(extentReport.toURI());
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		  }

	

}
