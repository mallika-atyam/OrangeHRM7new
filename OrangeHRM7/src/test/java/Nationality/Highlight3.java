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

public class Highlight3
{	
	WebDriver driver;
	
	//@Test
	public void Test1() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = " https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");	
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.partialLinkText("Recruit")).click();
		
		
		driver.quit();
		
	}
	
	
	@Test
	public void Test2() throws Exception 
	{
		
	     driver = TestBrowser.OpenChromeBrowser();
		 driver.get("http://www.google.com");
		 List <WebElement> list = driver.findElements(By.tagName("a"));
		 
	
		 System.out.println("Number of links: "+list.size());
		 for(int i = 0; i < list.size(); i++)
		 {
			 	System.out.println(list.get(i).getText());
			 	
		 
		 }
		 
		 driver.quit();
	}
	
	

	@Test
	public void Test3() throws Exception 
	{
			
		
	     driver = TestBrowser.OpenChromeBrowser();
		 driver.get("http://demo.guru99.com/test/facebook.html");
		 
		 driver.findElement(By.cssSelector("input#email")).sendKeys("Admin");
		 driver.findElement(By.cssSelector("input#pass")).sendKeys("Admin123");
		 driver.quit();
	}
	
	
	
	
			
	
	
	
}











