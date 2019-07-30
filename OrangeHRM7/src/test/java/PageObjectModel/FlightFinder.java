package  PageObjectModel;
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

public class FlightFinder
{
	
	WebDriver driver;
	public FlightFinder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	// All xpaths of  Mercury FlightFinderPage by Sudhakar Date:12-Jan-2018
	public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
	public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";
	public static String MFFPage_PassengersCountListbox="//select[@name='passCount']";
	public static String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
	public static String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
	public static String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
	public static String MFFPage_ArrivingIn="//select[@name='toPort']";
	public static String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
	public static String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
	public static String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
	public static String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
	public static String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
	public static String MFFPage_AirLineListbox ="//select[@name='airline']";
	public static String MFFPage_ContinueButton ="//*[@name='findFlights']";
	public static String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
	//End MercuryFlightFinderPage
	
	
	
	

	public void FlightFinderPage_OneWayBooking() throws Exception {
		
		// Round trip or Oneway
		driver.findElement(By.xpath(FlightFinder.MFFPage_OneWayRadiobutton)).click();
		
		//Selecting Passengers count
		Select select = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_PassengersCountListbox)));
		select.selectByIndex(1);  //  2 is selected in list box

		//Selecting Departing From
		Select select1 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingFromListbox)));
		select1.selectByIndex(2); //London is selected in list box
		
		//Selecting Departing Month
		Select select2 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingStartMonthListbox)));
		select2.selectByIndex(2); //February is selected in list box
	
		//Selecting Departing DD
		Select select3 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingStartDateListbox)));
		select3.selectByIndex(2); //3 is selected in list box
		
		//Selecting Arriving In
		Select select4 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_ArrivingIn)));
		select4.selectByIndex(2); //NewYork is selected in list box

	}
	
	
	
	
	
	
	
	

}












