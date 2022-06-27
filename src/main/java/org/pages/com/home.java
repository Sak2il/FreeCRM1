package org.pages.com;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.browser.com.*;

public class home extends Browser {

	public static void moveToElement(String string) {
		try {
			Thread.sleep(4000);
			Actions action = new Actions(driver);
			String filePath3 = Browser.fileProperties("key");
			List <WebElement> moduleData = driver.findElements(By.xpath(filePath3));
			System.out.println(moduleData.size());
			for (WebElement e : moduleData) {
				if (e.getText().equals(string)) {
					action.moveToElement(e).build().perform();
					Thread.sleep(4000);
					e.click();
				}
			}
		}catch(Exception e) {
			System.out.println("Move To Element");
		}
	}
}