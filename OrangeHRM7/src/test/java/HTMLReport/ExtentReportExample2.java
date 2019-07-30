package  HTMLReport;
import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;
import HTMLReport.TestHTMLReporter7;
//import HTMLReport.TestHTMLReporter8;
//import HTMLReport.TestHTMLReporter8;
import ExcelUtil.ExcelApiTest4;
import Login.Login2;


import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.util.concurrent.TimeUnit;

import java.io.File;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

import HTMLReport.Reporter1;

public class ExtentReportExample2
{
	
	WebDriver driver;
	
	@Test
	public void Test3() throws Exception {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Test33.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("loginTest");

		Reporter1 R1= new Reporter1("Test3");

		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		
		driver.get(TestURL);
		String str=R1.getScreenShotPath(driver);
		logger.pass("Open Browser",MediaEntityBuilder.createScreenCaptureFromPath(str).build());
	
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		str=R1.getScreenShotPath(driver);
		logger.pass("UserName Entered",MediaEntityBuilder.createScreenCaptureFromPath(str).build());
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		str=R1.getScreenShotPath(driver);
		logger.pass("Password Entered",MediaEntityBuilder.createScreenCaptureFromPath(str).build());
		
		driver.findElement(By.xpath(OR.password_sendkey)).click();
		String screenShotPath = ExtentReportExample2.capture(driver, "screenShotName");
		logger.pass("Sign In  Clicked",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		extent.flush();
		driver.close();
		
	}
	

	
	
	public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
		
		 SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss:SSS a"); 
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
		
		
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+screenShotName+"_"+strDate+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
	
	
	
	
	
	
	
	
	
	
}












