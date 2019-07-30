package  Employee;
import CommonUtil.*;
import HTMLReport.TestHTMLReporter6;
import ExcelUtil.ExcelApiTest3;
import Login.Login;


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

 
public class AddEmpDataProvider3
{

 public  static 	String UserName, Password ;
 public  static String FirstName, MiddleName, LastName, Id, PhotoPath;
	
	public static int iRow=0;

	
	static WebDriver driver;
	static String HtmlOutputFileName="";
	static String error;
	static TestHTMLReporter6 TH3;
	
	static String TestScriptName="TC01_Add_Employee";

	public  void AddEmpDataProvider3(WebDriver driver,
			String HtmlOutputFileName,TestHTMLReporter6 TH3 )throws Exception
	{  
		this.driver=driver;
		this.HtmlOutputFileName=HtmlOutputFileName;
		this.TH3=TH3;
	}
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public static WebElement findElement(By by)throws Exception {
	    WebElement elem = driver.findElement(by);
	 
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	    } 
	    Thread.sleep(10);
	    
	    return elem;
	}
	
	

	@DataProvider (name = "TC01_Add_Employee_Data")
    public static  Object[][] Authentication1() throws Exception{
		
		ExcelApiTest3 eat= new ExcelApiTest3();
        Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_AddEmp.xls","Sheet1");
        // System.out.println(testObjArray.length);
          return (testObjArray); 
	}
	
	
    
	
	@BeforeTest
	public   void  CreateHTML() throws Exception
	{
		TH3= new TestHTMLReporter6();
		HtmlOutputFileName=TH3.CretaeHTMLFile(TestScriptName,"Chrome");
	}
	


	
	@Test(dataProvider="TC01_Add_Employee_Data")
	public static  void AddEmployee_call_allmethods(
			String UserName1,String Password1,String FirstName1,
			String MiddleName1,String LastName1,String Id1,String PhotoPath1  )throws Exception
	{  
			UserName=UserName1;
			Password=Password1;
			
			FirstName=FirstName1;
			MiddleName=MiddleName1;
			LastName=LastName1;
			Id=Id1;
			PhotoPath=PhotoPath1;
	
		  // DriverTest125.DriverScript1(TestScriptName);
			
			/*TC01_Add_Employee_OpenChromeBrowser();
			PassDriver_To_LoginPage();
			Login.openOrangeHRM();
			Login.OrangeHRMlogin(UserName,Password);
			Login.OrangeHRMSigninClick();
			AddEmploee();
			CloseBrowser();*/
			
			
			
		
	}	
	
	
	
	
	 public static  void PassDriver_To_LoginPage() throws Exception 
	 {
	 

		Login.Login(driver ,HtmlOutputFileName,TH3);
		Login.UserName=UserName;
		Login.Password=Password;

	 }
	 
	 
	 
	 
	 
	 public static  void AddEmploee() throws Exception 
	 {
	 
		 	//Login Page Operations
			AddEmpDataProvider3 AE =new AddEmpDataProvider3();
			AE.AddEmpDataProvider3(AddEmpDataProvider3.driver,
					AddEmpDataProvider3.HtmlOutputFileName,AddEmpDataProvider3.TH3 );
			
			AE.addEmpdetails(FirstName, MiddleName,LastName,Id);
			
			AE.PhotoUpload(PhotoPath);
 
	 }
	
	 
	 
	 
	

	 public static  void TC01_Add_Employee_OpenChromeBrowser() throws Exception 
	 {
		 	
		
		     AddEmpDataProvider3.driver=TestBrowser.OpenChromeBrowser();
			  AppendHtml(AddEmpDataProvider3.driver);
			
			
	 }
	 
	 
	
	
	 public static  void CloseBrowser() throws Exception 
	 {
		
			 TestBrowser.CloseBrowser(AddEmpDataProvider3.driver);

	 }
	
	

	public static  void  AppendHtml(WebDriver driver) throws Exception
	{
		
		AddEmpDataProvider3.iRow++;
	    String str=String.valueOf(AddEmpDataProvider3.iRow);
	    AddEmpDataProvider3.TH3.HTMLScreenShot(AddEmpDataProvider3.TestScriptName+"_Iteration_" + str,
				"Add Employee Iteration_"+ str ,"Pass", 
				AddEmpDataProvider3.HtmlOutputFileName,AddEmpDataProvider3.driver);
		
	}
	
	
	

	@AfterTest 
	public   void  CloseHtml() throws Exception
	{
		
		AddEmpDataProvider3.TH3.HTMLCloser(AddEmpDataProvider3.HtmlOutputFileName);
		AddEmpDataProvider3. TH3=null;
		System.gc();
	
	}
	
	
	
	
	
	
	public   void PhotoUpload(String PhotoPath)throws Exception
	{
		

		
	   findElement(By.xpath("//*[@id='photofile']")).click();

	
		Thread.sleep(1000);
		 
		// Specify the file location with extension
		// StringSelection sel = new StringSelection("C:\\Users\\Sudhakar\\Desktop\\download1.jpg");
		 
		StringSelection sel = new StringSelection(PhotoPath);
		   // Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
		 
		 // Create object of Robot class
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		      
		  // Press Enter
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(2000);
		        
		       //  Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 Thread.sleep(8000);
	
		findElement(By.xpath(OR.Emp_save_click)).click();
		
		TH3.HTMLScreenShot("Add Employee Page -  Select Photo to Photo  ","Upload photo selected","Pass",
				HtmlOutputFileName,driver);
		Thread.sleep(8000);
		 
		 TH3.HTMLScreenShot("Add Employee Page -  Upload Photo  ","Photo Uploaded","Pass",
				 HtmlOutputFileName,driver);
		 
		
		
	}
	
	
	


	public   void addEmpdetails(String FirstName,String MiddleName,String LastName,String Id )throws Exception
	{  
		

		try 
		{
		

		
		 Actions actions = new Actions(driver);   
		 System.out.println("reached here1");

		 
		 WebElement ele=findElement(By.xpath(OR.Emp_Pim_focus1));
		 actions.moveToElement(ele).click().perform();
		 TH3.HTMLScreenShot("Add Employee Page -  Highlight PIM Navigation  ",
				 "Pim Navigation clicked ","Pass", HtmlOutputFileName,driver);
		 
		 
		 findElement(By.xpath(OR.Emp_list_focus)).click();
		 TH3.HTMLScreenShot("Add Employee Page - Highlight Employee Navigation",
				 "Employee Navigation Clicked ","Pass", HtmlOutputFileName,driver);
		 
		 
		
		findElement(By.xpath(OR.Emp_pimadd_click)).click();
		TH3.HTMLScreenShot("Add Employee Page - Click on Add Employee button ",
				"Add Employee button clicked","Pass", HtmlOutputFileName,driver);
		 
		 
		
		 findElement(By.xpath(OR.Emp_firstname_sendkey)).sendKeys(FirstName);
		 TH3.HTMLScreenShot("Add Employee Page - Enter FirstName","FirstName Entered","Pass", HtmlOutputFileName,driver);
		
		 
		
		 findElement(By.xpath(OR.Emp_middlename_sendkey)).sendKeys(MiddleName);
		 TH3.HTMLScreenShot("Add Employee Page - Enter MiddleName","MiddleName Entered","Pass", HtmlOutputFileName,driver);
		 
		
		 findElement(By.xpath(OR.Emp_lastname_sendkey)).sendKeys(LastName);
		 TH3.HTMLScreenShot("Add Employee Page - Enter LastName","LastName Entered","Pass", HtmlOutputFileName,driver);
		 
		
		 findElement(By.xpath(OR.Emp_id_sendkey)).sendKeys(Id);
		 TH3.HTMLScreenShot("Add Employee Page - Enter Employee Id"," Employee Id Entered","Pass", HtmlOutputFileName,driver);
		 

		
	
		} 
		catch(Exception e)
		{
			
		}
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



