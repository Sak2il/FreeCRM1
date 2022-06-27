$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Logout/logout.feature");
formatter.feature({
  "name": "Verifying the Login functionality of FreeCRM website",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Opens the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "org.login.com.Login.opens_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters the url",
  "keyword": "When "
});
formatter.match({
  "location": "org.login.com.Login.enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicked on login button",
  "keyword": "And "
});
formatter.match({
  "location": "org.login.com.Login.user_clicked_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "org.login.com.Login.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user press Login button",
  "keyword": "And "
});
formatter.match({
  "location": "org.login.com.Login.user_press_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Calendar page",
  "keyword": "Then "
});
formatter.match({
  "location": "org.calendarpage.com.Homepage.user_navigate_to_the_Calendar_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "As a user, I want to Logout",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to the Calendar page",
  "keyword": "Then "
});
formatter.match({
  "location": "org.calendarpage.com.Homepage.user_navigate_to_the_Calendar_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the setting option",
  "keyword": "And "
});
formatter.match({
  "location": "org.logout.com.Logout.user_should_select_the_setting_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select logout button",
  "keyword": "And "
});
formatter.match({
  "location": "org.logout.com.Logout.user_select_logout_button()"
});
formatter.result({
  "status": "passed"
});
});