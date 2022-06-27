package org.createpage.com;

import java.io.IOException;

import org.excel.com.Excel;
import org.pages.com.Calendarpage;
import org.pages.com.CreateCalendarPage;
import org.screenshot.com.ScreenCapture;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createpage {
	
	@When("user click on Create button")
	public void user_click_on_Create_button() throws InterruptedException {
		CreateCalendarPage.clickOnCreateButton();
	}

	@When("user enters valid Title")
	public void user_enters_valid_Title() throws IOException, InterruptedException {
	  String title = Excel.readExcel(35, 5);
	  CreateCalendarPage.title(title);
	}

	/*@When("User select Start Date and End Date")
	public void user_select_Start_Date_and_End_Date() {
	   
	}*/

	@When("User Select the Category from dropdown list")
	public void user_Select_the_Category_from_dropdown_list() throws IOException, InterruptedException  {
		 String category = Excel.readExcel(43, 5);
		CreateCalendarPage.select_Category(category);
	   
	}
	

	@When("User select Tags of Calendar")
	public void user_select_Tags_of_Calendar() throws IOException, InterruptedException  {
		 String tags = Excel.readExcel(45, 5);
		
			CreateCalendarPage.enter_Tags(tags);
			
	}

	@When("user enters detailed Description")
	public void user_enters_detailed_Description() throws IOException, InterruptedException {
		String disp = Excel.readExcel(41, 5);
		CreateCalendarPage.enter_disp(disp);
	   
	}

	@When("user enter Location of meeting")
	public void user_enter_Location_of_meeting() throws IOException, InterruptedException {
		String location = Excel.readExcel(46, 5);
		CreateCalendarPage.enterlocation(location);
	}

	@When("user select the Information about Deals")
	public void user_select_the_Information_about_Deals() throws IOException, InterruptedException {
		String deals = Excel.readExcel(48, 5);
		CreateCalendarPage.enterdeals(deals);
	}

	@When("User enters the Task to be perform")
	public void user_enters_the_Task_to_be_perform() throws IOException, InterruptedException {
		String tasks = Excel.readExcel(49, 5);
		CreateCalendarPage.entertasks(tasks);
	}

	@When("user select the Case from list")
	public void user_select_the_Case_from_list() throws IOException, InterruptedException {
		String cases = Excel.readExcel(50, 5);
		CreateCalendarPage.entercases(cases);
	}
	
	@When("User select alert before meeting time")
	public void user_select_alert_before_meeting_time() throws IOException, InterruptedException {
		 String alerttime = Excel.readExcel(51, 5);
			CreateCalendarPage.selectAlertTime(alerttime);
	}

	@When("User get alert message Via Mail")
	public void user_get_alert_message_Via_Mail() throws IOException, InterruptedException {
		 String alertmessage = Excel.readExcel(52, 5);
			CreateCalendarPage.selectAlertMessage(alertmessage);
	}

	@When("User select the  member to whom the project is Assigned to")
	public void user_select_the_member_to_whom_the_project_is_Assigned_to() throws IOException, InterruptedException {
		String assignedto = Excel.readExcel(53, 5);
		CreateCalendarPage.enterAssignedTo(assignedto);
	}

	@When("User select the name of Participants")
	public void user_select_the_name_of_Participants() throws IOException, InterruptedException {
		String participant = Excel.readExcel(54, 5);
		CreateCalendarPage.enterParticpantName(participant);
	}
	
	@When("User Select the name of Company")
	public void user_Select_the_name_of_Company() throws IOException, InterruptedException {
		String company = Excel.readExcel(55, 5);
		CreateCalendarPage.enterCompanyName(company); 
	}
	
	@When("User Select the name of Identifier")
	public void user_Select_the_name_of_Identifier() throws IOException, InterruptedException {
		String identifiername = Excel.readExcel(56, 5);
		CreateCalendarPage.enterIdentiferName(identifiername);
	}
	
	@Then("user click on Save button")
	public void user_click_on_Save_button() throws InterruptedException {
		CreateCalendarPage.selectSaveButton();
		ScreenCapture.takeShot();
	}

	@Then("User navigate to the particular Calendar info page")
	public void user_navigate_to_the_particular_Calendar_info_page() {
		 Calendarpage.moveToElement();
	}


}
