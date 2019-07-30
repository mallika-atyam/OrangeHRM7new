package Employee;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest3;

import java.nio.file.*;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import java.lang.reflect.*;
public class DriverTest125 {
	
//	public static AddEmpDataProvider3 actionKeywords;

	
	public static String sActions;
	public static Method method[];
	

	public static void main()throws Exception
	{
		

		DriverScript1("TC01_Add_Employee");  
	
	} 
	


		public static void DriverScript1(String sActions1) throws Exception
		{
		  
			String sActions1Flag,sRegressionSheetPath;
			int NumberofKeywords = 0;
			
		  //sActions1 is for TC143
		  //sActions1Flag is Yes or No
		  //sRegressionSheetPath Check TC01 in E:\ drive
			ExcelApiTest3 eat = new ExcelApiTest3();
			boolean result2 = false;	
	   		//sActions1 = "TC143" ;
	   		sActions1Flag= "Yes" ;
	   		sRegressionSheetPath = "E://"+sActions1 + ".xls";
	   		
	   		
	   		// starts Number of Keywords in a Test Script
	   		try
	   		{
		   		NumberofKeywords=eat.getRowCount(sRegressionSheetPath,"Sheet1");
		   		NumberofKeywords=NumberofKeywords-1;
		   		System.out.println("Row Count  :"+NumberofKeywords);
		   		
	    	}   catch(Exception e) { e.printStackTrace(); }	
	 		// ends Number of Keywords in a Test Script
	   		

	   		
		    	for (int iRow=1;iRow<=NumberofKeywords;iRow++) // Number of Keywords in TC# Excel
		    	 {
		    		sActions = eat.getCellData(sRegressionSheetPath,"Sheet1",iRow,1); 
		    		
		    		
		    		System.out.println("sActions method name is:"+sActions);
		    	
		    		
		    		String s = sActions;
		    		String[] data = s.split("_", 2);
		    		//System.out.println("Name = "+data[0]); //class name
		    		//System.out.println("Address = "+data[1]); //method name

		    	
		    		
		    		result2=methodExists(sActions);
		    		
		    		if (result2)
		    		{
		    			execute_Actions(sActions);
		    		}
		    		else
		    		{
		    			System.out.println("This Method is not implemented :" +sActions);
		    			System.out.println("Excel Sheet path :" +sRegressionSheetPath);
		    			//break;
		    	   	 	
		    		} 
		    		
		    	 }  
		    	
		    	
	    	
	   	   	}
	   	   
	   	   	


	
	
	private static void execute_Actions(String myclassname) throws Exception
	{
		
		//Object object = createInstance("mypackage.MyClass","MyAttributeValue");
		
		String s1 = myclassname;
		String[] data = s1.split("_", 2);
		System.out.println("Class Name 11 = "+data[0]); //class name
		System.out.println("Method name 11 = "+data[1]); //method name
		
		myclassname=data[0];
		//sActions=data[1];
		
		method= Class.forName(myclassname).getMethods();
		
	
		for (int i=0;i<method.length;i++)
		{   
			
			if (method[i].getName().equals(data[1]))
			{
				
				System.out.println("This Execution Method is:" +data[1]);
				method[i].invoke(data[1]);
				break;
			} 
			
		} 
	}  // Private method
	
	
	//methodExists  starts 
	
	private static boolean methodExists(String myclassname) throws Exception
	{
		//AddEmpDataProvider3	actionKeywords = new AddEmpDataProvider3();
		
		
		String s = sActions;
		String[] data = s.split("_", 2);
	//	System.out.println("Name = "+data[0]); //class name
	//	System.out.println("Address = "+data[1]); //method name
		
		myclassname=data[0];

		
	//	Class<?> obj1 = Class.forName(myclassname);
		method= Class.forName(myclassname).getMethods();
		
		
		
		boolean result1 = false;
		
		for (int i=0;i<method.length;i++)
		{   
			
			
			//System.out.println("Actual method Name is :"+method[i].getName());
			
			
			if (method[i].getName().equals(data[1]))
			{
				//method[i].invoke(actionKeywords);
				
				System.out.println("method Name is :"+method[i].getName());
				result1 = true;
			} 
		
		} // for loop
		
		return result1;
		
	}
	
	//methodExists  ends
	
	
	
}	
	
	