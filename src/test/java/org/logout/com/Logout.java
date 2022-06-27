package org.logout.com;

import org.pages.com.logout;
import org.screenshot.com.ScreenCapture;

import io.cucumber.java.en.Then;

public class Logout {
	@Then("User should select the setting option")
	public void user_should_select_the_setting_option() throws InterruptedException {
	    logout.clickOnSetting();
	    ScreenCapture.takeShot();
	}

	@Then("User select logout button")
	public void user_select_logout_button() throws InterruptedException {
	    logout.selectLogoutButton();
	}

}
