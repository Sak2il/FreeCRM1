package org.pages.com;

import org.browser.com.Browser;
import org.openqa.selenium.By;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class logout extends Browser {

	public static void clickOnSetting() throws InterruptedException {
		
	extent.attachReporter(reporter);
		ExtentTest logout1 = extent.createTest("Select Setting Button");
		logout1.log(Status.INFO, "Select Setting Button");
		try {
			driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div")).click();
			 logout1.log(Status.PASS, "Setting Open");
		}catch (Exception e) {
			System.out.println("Name Not Entered");
			logout1.log(Status.FAIL, "Setting Not Open");
		}
		Thread.sleep(4000);
		extent.flush(); 
		
	}

	public static void selectLogoutButton() throws InterruptedException {
		
		extent.attachReporter(reporter);
		ExtentTest logout2 = extent.createTest("Logout");
		logout2.log(Status.INFO, "Logout from FreeCRM Website");
		try {
			driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/div[2]/div/div/a[5]")).click();
			 logout2.log(Status.PASS, "Logout from FreeCRM Website");
		}catch (Exception e) {
			System.out.println("Unable to Logout");
			logout2.log(Status.FAIL, "Unable to Logout");
		}
		Thread.sleep(4000);
		extent.flush(); 
		
	}

}
