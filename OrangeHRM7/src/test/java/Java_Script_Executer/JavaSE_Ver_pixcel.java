package  Java_Script_Executer;
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
public class JavaSE_Ver_pixcel 
{				
    @Test		
    public void Login() 					
    {		
       // WebDriver driver= new FirefoxDriver();	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize() ;	
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("https://opensource-demo.orangehrmlive.com/");			
      
           		
        //Login to Guru99 
       // WebElement username=driver.findElement(By.name("txtUsername"));
        WebElement password=driver.findElement(By.name("txtPassword"));
       
        WebElement username=driver.findElement(By.id("txtUsername"));
        js.executeScript("arguments[0].click();", username);
        
        js.executeScript("arguments[0].setAttribute('value','Admin')", username);
        js.executeScript("arguments[0].setAttribute('value','admin123')", password);
        
        //Perform Click on LOGIN button using JavascriptExecutor	
       WebElement button =driver.findElement(By.id("btnLogin"));	
        js.executeScript("arguments[0].click();", button);
        
        WebElement pim =driver.findElement(By.id("menu_pim_viewPimModule")); 
        js.executeScript("arguments[0].click();", pim);
        
        //This  will scroll down the page by  1000 pixel vertical
          js.executeScript("window.scrollBy(0,200)");
        
        //Find element by link text and store in variable "Element"        		
        //WebElement Element = driver.findElement(By.linkText("Morgan"));
        //This will scroll the page till the element is found		
       // js.executeScript("arguments[0].scrollIntoView();", Element);
        
        //This will scroll the web page till end.		
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        //driver.quit();*/
    }		
}