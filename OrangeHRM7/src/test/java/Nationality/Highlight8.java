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

public class Highlight8
{
	
	WebDriver driver;
	
	
	
	
	@Test
	public void Test1() throws Exception {
		

		Reporter1 R1= new Reporter1("Test1");
		//R1.TestName="Test1";
		//R1.Stepcount=0;
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		//Reporter.log("The browser launched1");
		//TakeScreenShotAuto(driver);
		R1.TakeScreenShotAuto(driver,"OpenBrowser","Pass");

		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		R1.TakeScreenShotAuto(driver,"UserName Entered","Pass");
		//Reporter.log("The browser launched2");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		R1.TakeScreenShotAuto(driver,"Password Entered","Pass");
		//Reporter.log("The browser launched3");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		R1.TakeScreenShotAuto(driver,"Sign In  Clicked","Fail");
		//TakeScreenShotAuto(driver);
		//Reporter.log("The browser launched4");
		//Reporter.log("<a href='file:///C:/Users/anbajaj/Desktop/test.xml'>Response</a>"); 


	}
	
	
	@Test
	public void Test2() throws Exception {
		
		Reporter1 R2= new Reporter1("Test2");
	
		
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		//Reporter.log("The browser launched1");
		//TakeScreenShotAuto(driver);
		R2.TakeScreenShotAuto(driver,"OpenBrowser","Pass");

		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		R2.TakeScreenShotAuto(driver,"UserName Entered","Pass");
		//Reporter.log("The browser launched2");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		R2.TakeScreenShotAuto(driver,"Password Entered","Pass");
		//Reporter.log("The browser launched3");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		R2.TakeScreenShotAuto(driver,"Sign In  Clicked","Pass");
		//TakeScreenShotAuto(driver);
		//Reporter.log("The browser launched4");
		//Reporter.log("<a href='file:///C:/Users/anbajaj/Desktop/test.xml'>Response</a>"); 


	}
	
	
	
}












