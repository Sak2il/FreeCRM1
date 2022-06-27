package org.pages.com;

import java.util.List;

import org.browser.com.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class CreateCalendarPage extends Browser {

	public static void clickOnCreateButton() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create1 = extent.createTest("Click Create Button");
		create1.log(Status.INFO, "Click Create Button");
		try {Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
			create1.log(Status.PASS, "Button Clicked");
		}catch(Exception e) {
			System.out.println("Button NOt Pressed");
			create1.log(Status.PASS, "Button NOt Clicked");
		}
		Thread.sleep(4000);
		 extent.flush();
	}

	public static void title(String title) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create2 = extent.createTest("Enter Title");
		create2.log(Status.INFO, "Enter title");
		try {
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys(title);
			create2.log(Status.PASS, "Title Entered");
		}catch(Exception e) {
			System.out.println("Title NOt Entered");
			create2.log(Status.FAIL, "Title Not Entered");
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void select_Category(String category) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create3 = extent.createTest("Select Category");
		create3.log(Status.INFO, "Select Category");
		try {
			Actions cat = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div")).click();



			List<WebElement> status_Name = driver
			.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div"));
			System.out.println(status_Name.size());
			for (WebElement web : status_Name) {
			if (web.getText().equals(category)) {
			cat.moveToElement(web).build().perform();
			Thread.sleep(4000);
			web.click();
			}create3.log(Status.PASS, "Category Selected");
			}
			}catch(Exception e){
			System.out.println("Category Not Selected");
			create3.log(Status.FAIL, "Category Not Selected");
			}
		Thread.sleep(4000);
		extent.flush();
		}

	public static void enter_Tags(String tags) throws InterruptedException {
		
		 
		 extent.attachReporter(reporter);
			ExtentTest create4 = extent.createTest("Enter Tags");
			create4.log(Status.INFO, "Enter Tags");
			try {
				driver.findElement(By.xpath("//body/div/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")).sendKeys(tags);
				
				 driver.findElement(By.xpath("//body/div/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")).sendKeys(Keys.ENTER);
				create4.log(Status.PASS, "Tags Entered");
			}catch(Exception e) {
				System.out.println("Tags NOt Entered");
				create4.log(Status.FAIL, "Tags Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
	}

	public static void enter_disp(String disp) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create5 = extent.createTest("Enter Discription");
		create5.log(Status.INFO, "Enter Discription");
		try {
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[1]/div/textarea")).sendKeys(disp);
			create5.log(Status.PASS, "Discription Entered");
		}catch (Exception e) {
			System.out.println("No Discription");
			create5.log(Status.FAIL, "No Discription");
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void enterlocation(String location) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create6 = extent.createTest("Enter Location");
		create6.log(Status.INFO, "Enter Location");
		try {
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/textarea")).sendKeys(location);
			create6.log(Status.PASS, "Location Provided");
		}catch (Exception e) {
			System.out.println("Location is not Provided");
			create6.log(Status.FAIL, "Location is not Provided");
		}
		Thread.sleep(4000);
		extent.flush();
	}

	public static void enterdeals(String deals) throws InterruptedException {
		
		 extent.attachReporter(reporter);
			ExtentTest create7 = extent.createTest("Enter Deals");
			create7.log(Status.INFO, "Enter Deals");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[2]/div/div/input")).sendKeys(deals);
				
				 driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[2]/div/div/input")).sendKeys(Keys.ENTER);
				 create7.log(Status.PASS, "Deals Entered");
			}catch (Exception e) {
				System.out.println("Deals Not Entered");
				create7.log(Status.FAIL, "Deals Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
	}

	public static void entertasks(String tasks) throws InterruptedException {
		
		
		 extent.attachReporter(reporter);
			ExtentTest create8 = extent.createTest("Enter Tasks");
			create8.log(Status.INFO, "Enter Tasks");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/input")).sendKeys(tasks);
				
				 driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[1]/div/div/input")).sendKeys(Keys.ENTER);
				 create8.log(Status.PASS, "Task Entered");
			}catch (Exception e) {
				System.out.println("Task Not Entered");
				create8.log(Status.FAIL, "Task Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
	}

	public static void entercases(String cases) throws InterruptedException {
		 WebElement move = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[10]/div/div/div/input"));
		 Actions act = new Actions(driver);
		 act.moveToElement(move).build().perform();
		 extent.attachReporter(reporter);
			ExtentTest create9 = extent.createTest("Enter Cases");
			create9.log(Status.INFO, "Enter Cases");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input")).sendKeys(cases);
				
				 driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[6]/div[2]/div/div/input")).sendKeys(Keys.ENTER);
				 create9.log(Status.PASS, "Cases entered");
			}catch (Exception e) {
				System.out.println("Cases Not Entered");
				create9.log(Status.FAIL, "Cases Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
	}

	

	public static void selectAlertTime(String alerttime) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create11 = extent.createTest("Select Alert Time");
		create11.log(Status.INFO, "Set Alert Time");
		try {
			Actions cat = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div[1]/div")).click();



			List<WebElement> status_Name = driver
			.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div[1]/div"));
			System.out.println(status_Name.size());
			for (WebElement web : status_Name) {
			if (web.getText().equals(alerttime)) {
			cat.moveToElement(web).build().perform();
			Thread.sleep(1000);
			web.click();
			}create11.log(Status.PASS, "Alert Time Set");
			}
			}catch(Exception e){
			System.out.println("Alert Time is not Selected");
			create11.log(Status.FAIL, "Alert Time Not Set");
			}
		Thread.sleep(1000);
		extent.flush();
		}
		
	

	public static void selectAlertMessage(String alertmessage) throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create12 = extent.createTest("Set Alert Message");
		create12.log(Status.INFO, "Set Alert Message");
		try {
			Actions cat = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div[2]/div")).click();



			List<WebElement> status_Name = driver
			.findElements(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[1]/div/div/div[2]/div/div/div"));
			System.out.println(status_Name.size());
			for (WebElement web : status_Name) {
			if (web.getText().equals(alertmessage)) {
			cat.moveToElement(web).build().perform();
			Thread.sleep(1000);
			web.click();
			}create12.log(Status.PASS, "Alert Message Set");
			}
			}catch(Exception e){
			System.out.println("Alert Message is Not Send");
			create12.log(Status.FAIL, "Alert Message Not Set");
			}
		Thread.sleep(1000);
		extent.flush();
	}

	public static void enterAssignedTo(String assignedto) throws InterruptedException {
		
		 extent.attachReporter(reporter);
			ExtentTest create13 = extent.createTest("Enter Assigned to Name");
			create13.log(Status.INFO, "Enter Assigned to Name");
			try {
				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div[1]/div/div/input")).sendKeys(assignedto);
				
				 driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[8]/div[1]/div/div/input")).sendKeys(Keys.ENTER);
				 create13.log(Status.PASS, "Name Entered");
			}catch (Exception e) {
				System.out.println("Name Not Entered");
				create13.log(Status.FAIL, "Name Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
			
		
	}

	public static void enterParticpantName(String participant) throws InterruptedException {
		
		 extent.attachReporter(reporter);
			ExtentTest create14 = extent.createTest("Enter Particpant Name");
			create14.log(Status.INFO, "Enter Particpant Name");
			try {
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/input")).sendKeys(participant);
				
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/input")).sendKeys(Keys.ENTER);
				 create14.log(Status.PASS, "Name Entered");
			}catch (Exception e) {
				System.out.println("Name Not Entered");
				create14.log(Status.FAIL, "Name Not Entered");
			}
			Thread.sleep(4000);
			extent.flush();
			
		
	}
	
	public static void enterCompanyName(String company) throws InterruptedException {
		
		 extent.attachReporter(reporter);
			ExtentTest create15 = extent.createTest("Enter Comapany Name");
			create15.log(Status.INFO, "Enter Company Name");
			try {
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")).sendKeys(company);
				
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")).sendKeys(Keys.ENTER);
				 create15.log(Status.PASS, "Name Entered");
			}catch (Exception e) {
				System.out.println("Name Not Entered");
				create15.log(Status.FAIL, "Name Not Entered");
			}
			Thread.sleep(4000);
			extent.flush(); 
			
		
	}		

	public static void enterIdentiferName(String identifiername) throws InterruptedException {
		
		 extent.attachReporter(reporter);
			ExtentTest create16 = extent.createTest("Enter Indentifer Name");
			create16.log(Status.INFO, "Enter Identifer Name");
			try {
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[10]/div/div/div/input")).sendKeys(identifiername);
				
				 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[10]/div/div/div/input")).sendKeys(Keys.ENTER);
				 create16.log(Status.PASS, "Name Entered");
			}catch (Exception e) {
				System.out.println("Name Not Entered");
				create16.log(Status.FAIL, "Name Not Entered");
			}
			Thread.sleep(4000);
			extent.flush(); 
	}
	

	public static void selectSaveButton() throws InterruptedException {
		extent.attachReporter(reporter);
		ExtentTest create10 = extent.createTest("Savee Button");
		create10.log(Status.INFO, "Click Save Button");
		try {
			driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
			create10.log(Status.PASS, " Save Button Clicked");
		}catch(Exception e) {
			System.out.println("Button NOt Pressed");
			create10.log(Status.FAIL, "Save Button Not Clicked");
		}
		Thread.sleep(1500);
		extent.flush();
	}
	
	}
	

	
		
	

	


