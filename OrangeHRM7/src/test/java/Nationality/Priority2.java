package  Nationality;
import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.firefox.FirefoxDriver;			
import org.testng.Assert;			
import org.testng.annotations.Test;			

import CommonUtil.*;
import org.openqa.selenium.JavascriptExecutor;
import HTMLReport.TestHTMLReporter7;
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
public class Priority2
{
	 WebDriver driver;	
	 	@Test	(priority=2)	
	    public void Method1() {				
	    	driver.get("http://newtours.demoaut.com/");	
	    }
	 	@Test	(priority=3)	
	    public void Method2() {
	    	driver.get("http://www.google.co.in");						
	    }		
	    		
	    @Test	(priority=4)	
	    public void Method3() throws Exception {				
	    	 driver.get("https://opensource-demo.orangehrmlive.com/");
	    }		
	    @Test	(priority=1)	
	    public void Method4() {	
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			 driver.manage().window().maximize() ;					
	    }		
	    	
	    
	}