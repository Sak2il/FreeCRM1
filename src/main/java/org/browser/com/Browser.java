package org.browser.com;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report1/report.html");
	public static ExtentReports extent = new ExtentReports();
   public static WebDriver driver;
   public static Actions act;
   public static WebDriverWait wait;
   
   //static ReadProperties obj = new ReadProperties("./src/main/resources/ApplicationProperty/Configuration.properties");
   
   
   public static String fileProperties(String propertiesData) throws FileNotFoundException
   {
	   String returnData = null;
	   String searchData = propertiesData;
	   try
	   {
	   String filepath = System.getProperty("user.dir")+"//src/main/resources/ApplicationProperty/Configuration.Properties";
	   FileInputStream objFile = new FileInputStream(filepath);
	   Properties obj = new Properties();
	   obj.load(objFile);
	   returnData = obj.getProperty(searchData);
	   //System.out.println(returnData);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Properties");
	   }
	
       return returnData;
   }
   
   public static WebDriver setDriver(){
	   try {
			String browserChoice = Browser.fileProperties("browser");//chrome
			System.out.println(browserChoice);
			
			//String browserChoice = Browser.fileProperties("browser");
			if (browserChoice.equals("chrome")) {
				driver = setChromeDriver();
			} else if (browserChoice.equals("firefox")) {
				driver = setFirefoxDriver();
			} else if (browserChoice == "edge") {
				driver = setEdgeDriver();
			} else 
			{ 
				System.out.println("Invalid data...");
			}	
			act = new Actions(driver);
		}catch (Exception e)
		{
			System.out.println("Browser Input");
			System.out.println(e);
		}
		return driver;
   }

   /*
	 *  ChromeDriver Setup Method
	 */
	public static WebDriver setChromeDriver() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}catch(Exception e)
		{
			System.out.println("Chrome");
			System.out.println(e);
		}
		return driver;
	}

	// Internet Explorer Driver Setup Method
	public static WebDriver setFirefoxDriver() {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}catch(Exception e)
		{
			System.out.println("Firefox");
			System.out.println(e);
		}
		return driver;
	}

	// Microsoft Edge Driver Setup Method
	public static WebDriver setEdgeDriver() {
		try {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}catch(Exception e)
		{
		    System.out.println("Edge");
		    System.out.println(e);
		}
		return driver;
	}
	
	// Url Setup Method
	public static void getUrl() throws Exception {
		try {
		    String url = Browser.fileProperties("url");
		    driver.get(url);
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		}catch(Exception e)
		{
		    System.out.println("URL Method");
		}
	}
	
	// Method to get title of the browser window
	public static String getTitle() throws Exception {
		String actualTitle = driver.getTitle();
		return actualTitle;			
	}
		
	// Driver Close Method
	public static void closeBrowser() {
		try {
			driver.quit();
		}catch(Exception e)
		{
			System.out.println("closing");
		}
	}
}

