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

public class ListBox
{
	WebDriver driver;
	
	@Test
	public void Test1() throws Exception {
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = " http://newtours.demoaut.com/";
		driver.get(TestURL);

		//driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("merucry");
		driver.findElement(By.name("userName")).sendKeys("merucry");
		
		  driver.findElement(By.id("firstName")).sendKeys("merucry");
		  
		 
		
		driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");
		
		driver.findElement(By.xpath(OR.MLPage_SignInButton)).click();
		
		Select select = new Select(driver.findElement(By.xpath(OR.MFFPage_ReturningEndMonthListbox)));
		select.selectByIndex(3);
		//select.selectByValue("Value");
		//select.selectByVisibleText("By Visible Text");
	}
	
}












