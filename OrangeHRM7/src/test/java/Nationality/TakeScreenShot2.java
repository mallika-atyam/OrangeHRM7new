package  Nationality;
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

public class TakeScreenShot2
{
	
	WebDriver driver;
	String HtmlOutputFolder,TestName="Test11";
	
	
	String HtmlSourceTemplate ="C:\\HTML Report\\HtmlTemplates\\HtmlReport3.html";
	
	
	@BeforeTest
	public void Test10()throws Exception {
		
	String HtmlOutputFolder1 ="D:\\HTML Report";
	SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	Date now5 = new Date();
	String strDate6 = sdfDate5.format(now5);
	HtmlOutputFolder = HtmlOutputFolder1 	+ "\\" + TestName +  strDate6;
	
	}
	
	@Test
	public void Test11() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = " https://opensource-demo.orangehrmlive.com/";
		
		driver.get(TestURL);
		TakeScreenShot1(driver);
		
		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		TakeScreenShot1(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		TakeScreenShot1(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		
		driver.quit();

	}
	
	
	
	public void TakeScreenShot1(WebDriver driver) throws Exception
	{
		
	
	 // String HtmlOutputFolder1 ="C:\\HTML Report";
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
	
	 Date now = new Date();
	 String strDate = sdfDate.format(now);

	 String fileWithPath= HtmlOutputFolder +"\\"+TestName+"_"+strDate +".png";
	     
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	 //Move image file to new destination
	  File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);

	}
	
	
	
	

}












