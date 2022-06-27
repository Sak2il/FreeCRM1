package org.testrunner.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Logout",
glue = {"org.login.com","org.calendarpage.com","org.logout.com"}, strict = true, monochrome = false,
plugin ={"pretty", "html:target/HtmlReports", "json:target/JsonReports/Report.json", "junit:target/JunitReports/Report.xml"})
public class logoutrunner extends AbstractTestNGCucumberTests{

}
