package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class NewCalendar extends Browser{
	
	public static void clickOnTop() throws InterruptedException {
		
		
		extent.attachReporter(reporter);
		ExtentTest newcalendar1 = extent.createTest("Click on Side");
		newcalendar1.log(Status.INFO, "Click on Side");
		try {
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]")).click();
			newcalendar1.log(Status.PASS, "Click on Side");
		}catch (Exception e) {
			System.out.println("Not Click on Side");
			newcalendar1.log(Status.FAIL, "Not Click on Side");
		}
		Thread.sleep(4000);
		extent.flush(); 
	}

	public static void selectManageCalendar() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar2 = extent.createTest("Select Manage Calendar");
		newcalendar2.log(Status.INFO, "Select Manage Calendar");
		
		try {
			Actions cat = new Actions(driver);
		
			List<WebElement> status_Name = driver
			.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div"));
			System.out.println(status_Name.size());
			for (WebElement web : status_Name) {
			if (web.getText().contains("Manage Calendars")) {
			cat.moveToElement(web).build().perform();
			Thread.sleep(4000);
			web.click();
			}
			}newcalendar2.log(Status.PASS, "Select Manage Calendar");
			}catch(Exception e){
			System.out.println(" Manage Calendar Not Selected");
			newcalendar2.log(Status.FAIL, "Manage Calendar Not Selected");
			}
		Thread.sleep(4000);
		//Thread.sleep(2000);
		extent.flush();
	}

	public static void clickOnAdd() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar3 = extent.createTest("Click on Add");
		newcalendar3.log(Status.INFO, "Click on Add");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/button")).click();
			newcalendar3.log(Status.PASS, "Not Click on Add");
		}catch(Exception e) {
			System.out.println("Button NOt Pressed");
			newcalendar3.log(Status.FAIL, "Not Click on Add");
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void enterCalendarName(String calendarname) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar4 = extent.createTest("Enter Calendar Name");
		newcalendar4.log(Status.INFO, "Enter Calendar Name");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/input")).sendKeys(calendarname);
			newcalendar4.log(Status.PASS, "Calendar Name Entered");
		}catch(Exception e) {
			System.out.println("Calendar Name NOt Entered");
			newcalendar4.log(Status.FAIL, "Calendar Name NOt Entered");
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void selectAddButton() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar5 = extent.createTest("Click on Side");
		newcalendar5.log(Status.INFO, "Click on Side");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/button")).click();
			newcalendar5.log(Status.PASS, "Calendar Name NOt Entered");
		}catch(Exception e) {
			System.out.println("Calendar Not Saved");
			newcalendar5.log(Status.FAIL, "Calendar Name NOt Entered");
		}
		Thread.sleep(4000);
		extent.flush();
		
	}

	public static void setPrimaryCalendar() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar6 = extent.createTest("Calendar set as Primary");
		newcalendar6.log(Status.INFO, "Calendar set as Primary");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[7]")).click();
			newcalendar6.log(Status.PASS, "Calendar set as Primary");
		}catch(Exception e) {
			System.out.println("Button NOt Pressed");
			newcalendar6.log(Status.FAIL, "Calendar is not set As Primary");
			
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void selectCloseButton() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest newcalendar7 = extent.createTest("Click Close Button");
		newcalendar7.log(Status.INFO, "Click Close Button");
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button")).click();
			newcalendar7.log(Status.PASS, "Click Close Button");
		}catch(Exception e) {
			System.out.println("Close Button Dsiable");
			newcalendar7.log(Status.FAIL, "Close Button Dsiable");
		}
		Thread.sleep(4000);
		extent.flush();
	}
		
	}

	


