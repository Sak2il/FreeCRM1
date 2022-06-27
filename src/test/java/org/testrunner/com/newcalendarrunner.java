package org.testrunner.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//CalendarNew",
glue = {"org.login.com","org.calendarpage.com","org.calendarnew.com"}, strict = true, monochrome = false,
plugin ={"pretty", "html:target/HtmlReports", "json:target/JsonReports/Report.json", "junit:target/JunitReports/Report.xml"})
public class newcalendarrunner extends AbstractTestNGCucumberTests{

}