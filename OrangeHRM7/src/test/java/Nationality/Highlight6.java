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

public class Highlight6
{
	
	WebDriver driver;
	
	public  String OutputFolder,TestName="Test11";
	public  String PassIcon  ="C:\\HTML Report\\HtmlTemplates\\passed.ico";
	public  String FailIcon  ="C:\\HTML Report\\HtmlTemplates\\failed.ico";
	public int Stepcount=0;
	
	@BeforeTest
	public void Create_Output_Folder()throws Exception {
		

	SimpleDateFormat sdfDate5 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
	Date now5 = new Date();
	String strDate6 = sdfDate5.format(now5);
	
	//new SimpleDateFormat("dd-MMM-yyyy h:mm:ss:SSS a"); 
	
	String OutputFolder1 ="D:\\HTML Report";
	OutputFolder = OutputFolder1 	+ "\\" + "New_Folder_" +  strDate6;
	
	}
	
	@Test
	public void Test1() throws Exception {
		
		Stepcount=0;
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		//Reporter.log("The browser launched1");
		//TakeScreenShotAuto(driver);
		TakeScreenShotAuto(driver,"OpenBrowser","Pass");

		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		TakeScreenShotAuto(driver,"UserName Entered","Pass");
		//Reporter.log("The browser launched2");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		TakeScreenShotAuto(driver,"Password Entered","Pass");
		//Reporter.log("The browser launched3");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		TakeScreenShotAuto(driver,"Sign In  Clicked","Fail");
		//TakeScreenShotAuto(driver);
		//Reporter.log("The browser launched4");
		//Reporter.log("<a href='file:///C:/Users/anbajaj/Desktop/test.xml'>Response</a>"); 


	}
	
	
	@Test
	public void Test2() throws Exception {
		
		Stepcount=0;
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "  https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		//Reporter.log("The browser launched1");
		//TakeScreenShotAuto(driver);
		TakeScreenShotAuto(driver,"OpenBrowser","Pass");

		driver.findElement(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		TakeScreenShotAuto(driver,"UserName Entered","Pass");
		//Reporter.log("The browser launched2");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.password_sendkey)).sendKeys("admin123");
		TakeScreenShotAuto(driver,"Password Entered","Pass");
		//Reporter.log("The browser launched3");
		//TakeScreenShotAuto(driver);
		
		driver.findElement(By.xpath(OR.login_click)).click();
		TakeScreenShotAuto(driver,"Sign In  Clicked","Pass");
		//TakeScreenShotAuto(driver);
		//Reporter.log("The browser launched4");
		//Reporter.log("<a href='file:///C:/Users/anbajaj/Desktop/test.xml'>Response</a>"); 


	}
	
	
	public void TakeScreenShotAuto(WebDriver driver) throws Exception
	{
		
	
	 //Timestamp  append for .png file
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
	 Date now = new Date();
	 String strDate = sdfDate.format(now);
	 
	 //Takes screenshot
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	 //Move image file to new destination
	 String fileWithPath= OutputFolder +"\\"+TestName+"_"+strDate +".png";
	 File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);
		
		 String str="<a href='file:///"
		 		+ ScreenShotPath
		 		+ "'>ScreenShot</a>";
		 
		/* String str1="<b>+"
		 		+ " Response" +
				 "</b>";*/
		
		 
		 
		Reporter.log(str); 

	}
	
	
	
	
	
	
	public void TakeScreenShotAuto(WebDriver driver,String Textmsg,String PassorFail) throws Exception
	{
		
	
	 //Timestamp  append for .png file
	 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss a");
	 Date now = new Date();
	 String strDate = sdfDate.format(now);
	 
	 //Takes screenshot
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	     
	 //Move image file to new destination
	 String fileWithPath= OutputFolder +"\\"+TestName+"_"+strDate +".png";
	 File DestFile=new File(fileWithPath);

	      //Copy file at destination
	      try {
	              FileUtils.copyFile(SrcFile, DestFile);
	          } catch(Exception e ) {}
	              
	    
	     String ScreenShotPath = DestFile.getAbsolutePath();
		 ScreenShotPath = ScreenShotPath.replace("\\", "/");
		 
		 System.out.println("HTML Screen Shot Path : "+ScreenShotPath);
		
		 String ScreenShot1="<a href='file:///"
		 		+ ScreenShotPath
		 		+ "'>ScreenShot</a>";
		 
		 String ScreenShot2= "<a href=" + ScreenShotPath + " target=\"popup\" "
		    		+ "onclick=\"window.open('"
		    		+ ScreenShotPath
		    		+ "','popup','width=600,height=600'); return false;\"> " + "ScreenShot" + "</a> ";
		 
		 
		 String PASS="<img src='file:///"
			 		+ PassIcon
			 		+ "'    +     \"width=\"30\" + height=\"30\"></img>";
		 
		 String FAIL="<img src='file:///"
			 		+ FailIcon
			 		+ "'    +     \"width=\"30\" + height=\"30\"></img>";
		 
		 
			SimpleDateFormat sdfDate5 = new SimpleDateFormat("dd-MMM-yyyy h:mm:ss:SSS a");
			Date now5 = new Date();
			String strDate6 = sdfDate5.format(now5);
			
		
		 
		
		 
		 String Textmsg1="<b><font color='black'>   "
		 		+ Textmsg +
				 "</b> </font>";
		 
		 Stepcount = Stepcount+1;
		
		 String Str2= "Step" + "&nbsp;"+ Stepcount 
				 + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 + Textmsg1 +
				 " " +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" 
		 + ScreenShot2 + " "  +  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" 
		 +  strDate6    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"    + PASS + "<br>";
		 
		 
		 
		 
		 String Str3= "Step" + "&nbsp;"+ Stepcount 
				 + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
				 + Textmsg1 +
				 " " +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" 
		 + ScreenShot2 + " "  +  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" 
		 +  strDate6    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"    + FAIL + "<br>";
		 
		
		 if(PassorFail.equals("Pass"))
		 Reporter.log(Str2); 
		 else
		 Reporter.log(Str3); 	 
		
	

		
		
		
	//	String str3="<table>" + "<tr>"  +   "<th height=" + "40px" + "width=" + "50px" + ">" + "<center>S.No</center></th> "
		//	+ 	 "<th width=" + "250px" +">" + "width=" + "50px" + ">" + "<center>S.No</center></th> " + "</table>";
		 
		//Reporter.log(str3); 
		
	/*	<table id=customers>
		 <tr>
		  <th height="40px" width="50px"  ><center>S.No</center></th>  
		  <th width="250px"    ><center>Steps</center> </th>   
		   <th width="250px" ><center>Details </center></th>  
		  <th width="150px" ><center>Status</center></th> 
		  <th  width="150px"  ><center>Screen Shots</center></th>  
		  <th width="200px"  ><center>Date & Time</center></th>  
		 </tr>*/

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}












