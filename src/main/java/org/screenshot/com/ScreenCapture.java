package org.screenshot.com;



import org.openqa.selenium.OutputType;
import java.io.File;

import java.util.Calendar;

import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import org.browser.com.*;

public class ScreenCapture extends Browser{
	
 /* public static void screenShot(int i) throws Exception {		//String fileName
	try {
		//Converting WebDriver object to takeScreenshoot
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
			
		//Calling the getScreenshotAs() method to create an image file
		File Src=scrShot.getScreenshotAs(OutputType.FILE);	
			
		//Giving the location
		String filePath = System.getProperty("user.dir")+"//ScreenShots//Screenshot"+i+".png";
																		   
		//Moving image file to new destination
		File Dest=new File(filePath);	 
		
		//copying file at destination
		FileUtils.copyFile(Src, Dest);
		}
		catch(Exception e)
		{
				System.out.println("Screen Capture");
		}
	}*/
	
	
	
     
        

	public static void takeShot() {
		
		 try {
             String filename = "FreeCRM";

             Calendar cal = Calendar.getInstance();
             java.util.Date time = cal.getTime();

             //System.out.println(time);

             String timestamp = time.toString().replace(" ", "_").replace(":", "-")+ ".png";

             TakesScreenshot ts = (TakesScreenshot) driver;
             File src = ts.getScreenshotAs(OutputType.FILE);
             File trg = new File(".\\ScreenShot\\" + filename + timestamp);
             Files.copy(src, trg);
         }
         catch(Exception e)
         {
             System.out.println("Didn't Capture");
         }
    }
		
	}


