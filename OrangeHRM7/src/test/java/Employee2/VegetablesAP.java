//import MercuryDemoTours;

package Employee2;

import CommonUtil.*;
import HTMLReport.TestHTMLReporter6;
import ExcelUtil.ExcelApiTest3;
import Login.Login;

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
4. Navigate to employee screen
5. Export Employees to Excel sheet
5. logout and Quit
*/
 
public class VegetablesAP
{

	
	WebDriver driver;
	
					@Test
					 public void Vegetables_Test() throws Exception {
						
						/*Yerragadda();
						Falaknama();
						Mehdipatnam();
						Kukatpally();
						Meerpet();
						Ramakrishnapuram();
						Saroornagar();
						Vanasthalipuram();
						*/
						
						//Warangal_FatimaNagar();
						//Warangal_ExciseColony();
					}
						 
					
					
					
					
					
					 public void Yerragadda() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Hyderabad/Erragadda");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,2,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,2,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,2,Veg1_Price);
								
							  }
							  
							  
							  driver.quit();
							  	  
							  
					 }  
							  
					 
					 
					 
					 
					 
					 
					 public void Falaknama() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Hyderabad/Falaknama");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,3,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,3,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,3,Veg1_Price);
								
							  }
							  
							  
							  driver.quit();
							  	  
							  
					 }  
					 
					 
					 
					 
					 
					 public void Mehdipatnam() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Hyderabad/Mehdipatnam");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,4,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,4,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,4,Veg1_Price);
								
							  }
							  
							  
							  driver.quit();
							  	  
							  
					 }  
						
					 
					 
			
					 
					 
					 
					 

					 
					 public void Kukatpally() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Rangareddy/Kukatpally");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,5,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,5,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,5,Veg1_Price);
								
							  }
							  
							  
							 driver.quit();
							  	  
							  
					 }  
						
					 
					 
					 
					 
					 

					 public void Meerpet() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Rangareddy/Meerpet");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,6,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,6,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,6,Veg1_Price);
								
							  }
							  
							  
							 driver.quit();
							  	  
							  
					 }  
						
					 			 
					 

					 public void Ramakrishnapuram() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Rangareddy/Ramakrishnapuram");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,7,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,7,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,7,Veg1_Price);
								
							  }
							  
							  
							  driver.quit();
							  	  
							  
					 }  
						
					 
					   
					 
					 
							 
					 
					 public void Saroornagar() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Rangareddy/Saroornagar");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,8,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,8,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,8,Veg1_Price);
								
							  }
							  
							  
							 driver.quit();
							  	  
							  
					 }  
						
					 
					 
					
				
					 
					 
					 
					 
					 
		 
					 
					 public void Vanasthalipuram() throws Exception {
						 
						 
							ExcelApiTest3 eat = new ExcelApiTest3();
					
							  driver=TestBrowser.OpenChromeBrowser();	
							  driver.get("http://www.manarythubazar.com/Telangana/Rangareddy/Saroornagar");
							  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check Previous Date'])[1]/following::td[2]")).getText();
							  
							  for ( int i=1 ;i<10;i++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[1]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",i,9,Veg1_Price);
								
							  }
							  
							  
							  for ( int i=1,j=10 ;i<10;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[2]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,9,Veg1_Price);
								
							  }
							  
							  for ( int i=1,j=19 ;i<9;i++,j++)
							  {
								//String Veg= "//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[2]";
								String Veg_Price="//*[@id='body']/section/div/div[2]/div[1]/div[2]/div[3]/ol/" +  "li[" + i +  "]/table/tbody/tr/td[4]";
								
								//String Veg1=driver.findElement(By.xpath(Veg)).getText();
								String Veg1_Price=driver.findElement(By.xpath(Veg_Price)).getText();
							
								//eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,1,Veg1);
							    eat.PutCellData( "C://HTML Report//OrangeHRM6//TC01_VegTables.xls","Sheet5",j,9,Veg1_Price);
								
							  }
							  
							  
							  driver.quit();
							  	  
							  
					 }  
								 
					 
					 
					 
					
					 
					
}
				        
					
					
				
					
					
					
					
						
		





















						
						


	