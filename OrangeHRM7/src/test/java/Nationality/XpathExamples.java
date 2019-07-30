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

public class XpathExamples
{	
	WebDriver driver;
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public WebElement findElement(By by) throws Exception {
		WebElement elem = driver.findElement(by);
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		}
		Thread.sleep(5);

		return elem;
	}
	//

	
	//@Test
	public void BasicXPath() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = " http://demo.guru99.com/v1/";
		driver.get(TestURL);
		
	String Xpath1="//input[@type='text']";
	String Xpath2="//label[@id='message23']";
	String Xpath3="//input[@value='RESET']";
	String Xpath4="//*[@class='barone']";
	String Xpath5="//a[@href='http://demo.guru99.com/']";
		
		findElement(By.xpath(Xpath1));
		findElement(By.xpath(Xpath2));
		findElement(By.xpath(Xpath3));
		findElement(By.xpath(Xpath4));
		findElement(By.xpath(Xpath5));
		
		driver.quit();
			
	}
	
	//@Test
	public void BasicXPath1() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://www.guru99.com/";
		driver.get(TestURL);
		String Xpath1="//img[@src='/images/home/java.png']";
		findElement(By.xpath(Xpath1));
		//driver.quit();
	 }
	
	
	
	@Test
	public void Contains_XPath() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "http://demo.guru99.com/v1/";
		driver.get(TestURL);
		
		String Xpath1="//*[contains(@type,'sub')] ";
		String Xpath2="//*[contains(@name,'btn')]";
		findElement(By.xpath(Xpath1));
		findElement(By.xpath(Xpath2));
		
		String X1="//*[contains(@href,'guru99.com')]";  // 1 of 8
		
		String X2="//*[contains(@href,'guru99.com')    and text()='Agile Project'] ";	
		String X3="//*[contains(@href,'guru99.com')    and text()='Bank Project'] ";	
		
		String X4="//*[contains(@href,'guru99.com')    and text()='Bank Project']//following-sibling::input ";


		findElement(By.xpath(X2));  
		findElement(By.xpath(X3));
		findElement(By.xpath(X4));
		
		
		
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("Value");
		select.selectByVisibleText("By Visible Text");

		
	 }
	
	
	//@Test
	public void Self_Xpath() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "http://demo.guru99.com/v1/";
		driver.get(TestURL);
		
		String Xpath1="//*[@type='password']//self::input";
			
		findElement(By.xpath(Xpath1));
		

		
	 }

	
	
	//@Test
	public void Following_sibling_Xpath() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "http://demo.guru99.com/v1/";
		driver.get(TestURL);
		
		String Xpath1="//*[@type='submit']//following-sibling::input";
			
		findElement(By.xpath(Xpath1));
		

		
	 }
	
	
	
	
	//@Test
	public void Child_Xpath() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://www.guru99.com/";
		driver.get(TestURL);
		
		String Xpath1="//*[@id='java_technologies']/child::li";
		String Xpath2="//*[@id='java_technologies']/child::li[1]";
		String Xpath3="//*[@id='java_technologies']/child::li[2]";
		String Xpath4="//*[@id='java_technologies']/child::li[3]";
		String Xpath5="//*[@id='java_technologies']/child::li[4]";
		String Xpath6="//*[@id='java_technologies']/child::li[5]";
		

			
		//findElement(By.xpath(Xpath1));
		//findElement(By.xpath(Xpath2));
		findElement(By.xpath(Xpath3));
		findElement(By.xpath(Xpath4));
		findElement(By.xpath(Xpath5));
		findElement(By.xpath(Xpath6));


		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	

	
	
	//@Test
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
	
	

	//@Test
	public void Test3() throws Exception 
	{
			
		
	     driver = TestBrowser.OpenChromeBrowser();
		 driver.get("http://demo.guru99.com/test/facebook.html");
		 
		 driver.findElement(By.cssSelector("input#email")).sendKeys("Admin");
		 driver.findElement(By.cssSelector("input#pass")).sendKeys("Admin123");
		 driver.quit();
	}
	
	
	
	
			
	
	
	
}












