package org.login.com;



import java.io.IOException;

import org.browser.com.Browser;

import org.pages.com.*;
import org.screenshot.com.ScreenCapture;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("Opens the browser")
	public void opens_the_browser() {
		Browser.setDriver();
	}

	@When("Enters the url")
	public void enters_the_url() throws Exception {
		 Browser.getUrl();
	}

	@And("User clicked on login button")
	public void user_clicked_on_login_button() throws InterruptedException {
		Loginpage.clickOnLogin();
	}

	@Then("User enter username and password")
	public void user_enter_username_and_password() throws IOException, InterruptedException {
	    Loginpage.inputCredentials();
	}

	@And("user press Login button")
	public void user_press_Login_button() throws Exception {
	    Loginpage.clickOnLoginButton();
	    ScreenCapture.takeShot();
	}
	
	@Then("User navigate to the {string} page")
	public void user_navigate_to_the_page(String string) {
	    home.moveToElement(string);
	}
	
	@And("User nevigated to the website home page")
	public void user_nevigated_to_the_website_home_page() {
		//Browser.closeBrowser();
	}
}
