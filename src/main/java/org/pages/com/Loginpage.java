package org.pages.com;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.browser.com.*;
import org.excel.com.Excel;

public class Loginpage extends Browser{
	//By userKey = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input");
	//By passKey = By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input");
	//By pressKey = By.xpath("//*[@id=\"ui\"]/div[1]/div/form/div/div[4]");
	
	public static void clickOnLogin() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest login1 = extent.createTest("Click On Login Button");
		login1.log(Status.INFO, "Click on Login Button");
		try {
		String filePath = Browser.fileProperties("inputbox");
		WebElement input = driver.findElement(By.xpath(filePath));
		input.click();
		login1.log(Status.INFO, "Click on Login Button");
		}catch(Exception e)
		{
		System.out.println("Click on Login");
		login1.log(Status.INFO, "Login Button Not Clicked");
		}Thread.sleep(3000);
		extent.flush();
		}
	
	public static void inputCredentials() throws IOException, InterruptedException{
		extent.attachReporter(reporter);
		ExtentTest login2 = extent.createTest("Input Credentials");
		login2.log(Status.INFO, "Input Credentials");
		try 
		{
			Thread.sleep(4000);
			String userName = Excel.readExcel(6,5);
			String filePath = Browser.fileProperties("username");
			WebElement inputUsername = driver.findElement(By.xpath(filePath));
			inputUsername.sendKeys(userName);
			Thread.sleep(4000);
			String passWord = Excel.readExcel(7,5);
			String filePath1 = Browser.fileProperties("password");
			WebElement inputPassword = driver.findElement(By.xpath(filePath1));
			inputPassword.sendKeys(passWord);
			login2.log(Status.PASS, "UserName And Password Entered");
		}
		catch(NullPointerException e)
		{
			System.out.println("Input UserName and Password Data");
			login2.log(Status.FAIL, "UserName And Password Not Entered");
		}
		extent.flush();
	}
	
	public static void clickOnLoginButton() throws Exception {
		extent.attachReporter(reporter);
		ExtentTest login3 = extent.createTest("Select Login Button");
		login3.log(Status.INFO, "Click Login Button");
		try {
			   String filePath2 = Browser.fileProperties("presskey");
			   WebElement clickButton = driver.findElement(By.xpath(filePath2));
			   clickButton.click();
			   login3.log(Status.PASS, "Click on Login Button");
			}catch(Exception e)
			{
			   System.out.println("Click on Login Button");
			   login3.log(Status.FAIL, "Login Button Not Clicked");
			}Thread.sleep(3000);
			extent.flush();
	}

	/*public void usernameData(String userName) {
		try 
		{
			WebElement inputUsername = driver.findElement(userKey);
			inputUsername.sendKeys(userName); 
		}
		catch(Exception e)
		{
			System.out.println("Input UserName Data");
		}
		
	}

	public void passwordData(String passWord) {
		try 
		{
			WebElement inputPassword = driver.findElement(passKey);
			inputPassword.sendKeys(passWord); 
		}
		catch(Exception e)
		{
			System.out.println("Input Password Data");
		}
		
	}*/
}

