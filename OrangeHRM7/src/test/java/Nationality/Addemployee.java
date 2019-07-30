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
/*
 1. Open Chrome browser
 2. open Orange Application urL
 3. login
 4. Add employee details
 5. logout and Quit
 */

 
public class Addemployee
{

//public static String UserName, Password;

//public  static String Qua_Skills;

public static int iRow = 0;

WebDriver driver;
String HtmlOutputFileName = "";
String error;
TestHTMLReporter7 TH3;

public static String TestScriptName = "TC01_Addemployee";

public void AddemployeeDataProvider6(WebDriver driver, String HtmlOutputFileName, TestHTMLReporter7 TH3) throws Exception {
	this.driver = driver;
	this.HtmlOutputFileName = HtmlOutputFileName;
	this.TH3 = TH3;
}

// Draws a red border around the found element. Does not set it back anyhow.
public WebElement findElement(By by) throws Exception {
	WebElement elem = driver.findElement(by);

	// draw a border around the found element
	if (driver instanceof JavascriptExecutor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	}
	Thread.sleep(10);

	return elem;
}

@BeforeTest
public void CreateHTML() throws Exception {
	 String xlsFile="C://HTML Report//HtmlTemplates//TC05.xlsx";
	 String xlsFileSheet="Sheet1";
	 
	 ExcelApiTest4 eat = new ExcelApiTest4();
	 eat.clearsheetdata(xlsFile,xlsFileSheet);
	 
	 System.out.println("Before Suite called");

	TH3 = new TestHTMLReporter7();
	HtmlOutputFileName = TH3.CretaeHTMLFile(TestScriptName, "Chrome");

}

@DataProvider(name = "TC01_Addemployee")
public static Object[][] Authentication1() throws Exception {

	ExcelApiTest4 eat = new ExcelApiTest4();
	Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Emp.xlsx", "Sheet1");
	System.out.println(testObjArray.length);
	return (testObjArray);
}




@Test(dataProvider = "TC01_Addemployee")
public void PIM_Employeelist_call_allmethods(String TestUrl,String UserName, String Password,
		String FirstName, String MiddleName, String LastName, String EMPID) throws Exception {
	
	if (iRow==0)
	{

	driver = TestBrowser.OpenChromeBrowser();
	AppendHtml();

	Login2 l1 = new Login2();
	l1.Login(driver, HtmlOutputFileName, TH3);
	l1.openOrangeHRM(TestUrl);
	l1.OrangeHRMlogin(UserName, Password);
	l1.OrangeHRMSigninClick();
	}

	Addemployee PE = new Addemployee();
	PE.AddemployeeDataProvider6(driver, HtmlOutputFileName, TH3);
	
	PE.employeeDetails( FirstName,MiddleName,LastName,EMPID);



	iRow++;

}



@AfterTest
public void CloseHtml() throws Exception {
	
	TestBrowser.CloseBrowser(driver);

	TH3.HTMLCloser(HtmlOutputFileName);
	TH3 = null;
	System.gc();

}



public void AppendHtml() throws Exception {

	iRow++;
	String str = String.valueOf(iRow);
	TH3.HTMLScreenShot(TestScriptName + "_Iteration_" + str, "PIM Iteration_" + str, "Pass",
			HtmlOutputFileName, driver);

}




public   void employeeDetails(String FirstName, String MiddleName, String LastName, String EMPID )throws Exception
{  
	

	try 
	{
	
	 findElement(By.xpath(OR.Emp_Pim_focus1)).click();
	 
	 findElement(By.xpath(OR. Emp_AddEmp_focus)).click();
	 
	 TH3.HTMLScreenShot("Emp Page - Enter Emp","EmpDetails Entered","Pass", HtmlOutputFileName,driver);
	 findElement(By.xpath(OR.Emp_firstname_sendkey)).sendKeys(FirstName);
	 findElement(By.xpath(OR.Emp_middlename_sendkey)).sendKeys(MiddleName);
	 findElement(By.xpath(OR.Emp_lastname_sendkey)).sendKeys(LastName);
	 findElement(By.xpath(OR.Emp_id_sendkey)).sendKeys(EMPID);
	 findElement(By.xpath(OR.Emp_save_click)).click();

	    String str="//a[text()=";
		String str1="]";
		String str2= "'" + FirstName +"'";
		String str3=str+str2+str1;
		WebElement Element1 = findElement(By.xpath(str3));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		TH3.HTMLScreenShot("Add scroll ", "Scroll here", "Pass", HtmlOutputFileName, driver);
	
	} 
	catch(Exception e)
	{
		
	}
	 
	
 
}

}

