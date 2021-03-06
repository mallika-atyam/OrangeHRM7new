package TestNGUtil;

import ExcelUtil.ExcelApiTest4;
import HTMLReport.TestHTMLReporter7;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;
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
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.reflections.Reflections;
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




import org.testng.TestNG;

public class TestNGMainClass6 {
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void TCMAIN()  throws Exception {
		
		// Create object of TestNG Class
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();
		
		// Add xml file which you have to execute
		suitefiles.add("C://HTML Report//Test9.xml");
		runner.setOutputDirectory("C://HTML Report//test-output");
		runner.addListener(new Test5SuiteListener());

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
	
		
	}
	
	


@BeforeSuite
public void BeforesuiteSetup() throws Exception {
	
	 String xlsFile="C://HTML Report//HtmlTemplates//TC05.xlsx";
	 String xlsFileSheet="Sheet1";
	 
	 ExcelApiTest4 eat = new ExcelApiTest4();
	 eat.clearsheetdata(xlsFile,xlsFileSheet);
	 
	 System.out.println("Before Suite called");
}  	

@AfterSuite
public void AftersuiteSetup() throws Exception {
	 
	 TestHTMLReporter7 TH8 = new TestHTMLReporter7();	
	 TH8.Regression_CretaeHTMLFile();
	 
	 System.out.println("After Suite called");
	
}    

	


	

}