package org.calendarnew.com;

import java.io.IOException;

import org.excel.com.Excel;
import org.pages.com.NewCalendar;
import org.screenshot.com.ScreenCapture;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarNew {
	
	@Then("User click on top side")
	public void user_click_on_top_side() throws InterruptedException {
	    NewCalendar.clickOnTop();
	}

	@When("User click on Manage Calendars button")
	public void user_click_on_Manage_Calendars_button() throws InterruptedException {
	    NewCalendar.selectManageCalendar();
	}

	@When("User click on Add Calendar plus button")
	public void user_click_on_Add_Calendar_plus_button() throws InterruptedException {
	   NewCalendar.clickOnAdd();
	}

	@When("User Enter Name for New Calendar")
	public void user_Enter_Name_for_New_Calendar() throws IOException, InterruptedException {
		 String calendarname = Excel.readExcel(74, 5);
	    NewCalendar.enterCalendarName(calendarname);
	}

	@When("User click on Add button")
	public void user_click_on_Add_button() throws InterruptedException {
	    NewCalendar.selectAddButton();
	}

	@When("User can select the calendar to set it as Primary Calendar")
	public void user_can_select_the_calendar_to_set_it_as_Primary_Calendar() throws InterruptedException {
		 NewCalendar.setPrimaryCalendar();
		 ScreenCapture.takeShot();
	}

	@When("User click on Close button")
	public void user_click_on_Close_button() throws InterruptedException {
	    NewCalendar.selectCloseButton();
	}


}
