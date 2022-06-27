package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Calendarpage extends Browser{

	public static void moveToElement() {
		extent.attachReporter(reporter);
		ExtentTest home1 = extent.createTest("Click Button");
		home1.log(Status.INFO, "Click Create Button");
		try {
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			String filePath3 = Browser.fileProperties("key");
			List <WebElement> moduleData = driver.findElements(By.xpath(filePath3));
			System.out.println(moduleData.size());
			for (WebElement e : moduleData) {
				if (e.getText().equals("Calendar")) {
					action.moveToElement(e).build().perform();
					Thread.sleep(5000);
					e.click();
				}
			}home1.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Move To Element");
			 home1.log(Status.FAIL, "Button Not Clicked ");
		}
		 extent.flush();
	}
         
	public static void clickOnDay() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest home2 = extent.createTest("Click Button");
		home2.log(Status.INFO, "Click on Day Button");
			try {
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[3]/button[3]/span")).click();
			home2.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home2.log(Status.FAIL, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	}
	

	public static void clickOnWeek() throws InterruptedException {
	extent.attachReporter(reporter);
		ExtentTest home3 = extent.createTest("Click Button");
		home3.log(Status.INFO, "Click on Week Button");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[3]/button[2]/span")).click();
			home3.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home3.log(Status.FAIL, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	
	}

	public static void clickOnMonth() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest home4 = extent.createTest("Click Button");
		home4.log(Status.INFO, "Click on Month Button");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[3]/button[1]/span")).click();
			home4.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home4.log(Status.FAIL, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	}

	public static void clickOnAgenda() throws InterruptedException {
		
		
		extent.attachReporter(reporter);
		ExtentTest home5 = extent.createTest("Click Button");
		home5.log(Status.INFO, "Click on Angenda Button");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[3]/button[4]")).click();
			home5.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home5.log(Status.PASS, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	}

	public static void clickOnNext() throws InterruptedException {
		
		
		extent.attachReporter(reporter);
		ExtentTest home6 = extent.createTest("Click Button");
		home6.log(Status.INFO, "Click on Angenda Button");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[3]/i")).click();
			home6.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home6.log(Status.PASS, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	}

	public static void clickOnPrevious() throws InterruptedException {
		
		
		extent.attachReporter(reporter);
		ExtentTest home7 = extent.createTest("Click Button");
		home7.log(Status.INFO, "Click on Perivous Button");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/div[2]/div/div[1]/span[1]/button[2]/i")).click();
			home7.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
		}home7.log(Status.PASS, "Button Not Clicked");
		Thread.sleep(3000);
		extent.flush();
	}
	/*public static void clickOnNotification() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"onesignal-bell-launcher\"]/div[1]/svg/path")).click();
		Thread.sleep(3000);
	}*/
	
}
