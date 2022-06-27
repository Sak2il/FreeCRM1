package org.calendarpage.com;


import org.pages.com.Calendarpage;
import org.screenshot.com.ScreenCapture;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {
	
	
	@Then("User navigate to the Calendar page")
	public void user_navigate_to_the_Calendar_page() {
		 Calendarpage.moveToElement();
		 
	}

	@When("User clicks on Day button")
	public void user_clicks_on_Day_button() throws InterruptedException {
	   Calendarpage.clickOnDay();
	}

	@When("User clicks on Week button")
	public void user_clicks_on_Week_button() throws InterruptedException {
	    Calendarpage.clickOnWeek();
	}

	@Then("User clicks on Month button")
	public void user_clicks_on_Month_button() throws InterruptedException {
	   Calendarpage.clickOnMonth();
	}

	@Then("User clicks on Agenda button")
	public void user_clicks_on_Agenda_button() throws InterruptedException {
	  Calendarpage.clickOnAgenda();  
	}

	@Then("User clicks on Next \\(>) button")
	public void user_clicks_on_Next_button() throws InterruptedException {
	   Calendarpage.clickOnNext();
	}

	@Then("User clicks on Previous \\(<) button")
	public void user_clicks_on_Previous_button() throws InterruptedException {
	   Calendarpage.clickOnPrevious(); 
	   ScreenCapture.takeShot();
	}

	/*@Then("User clicks on Notification button")
	public void user_clicks_on_Notification_button() throws InterruptedException {
	  Calendarpage.clickOnNotification();
	}*/
}
