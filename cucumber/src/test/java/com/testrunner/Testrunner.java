package com.testrunner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Testcase.feature" ,
glue= {"com.stepdefintion"}
//plugin = {"pretty", "html:src/test/resources/reports/cucumber-html-report","json:src/test/resources/reports/cucumber-html-report/jsonreport",
//"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/reports/Extentreports/Extentreport.html"}
//tags = {"@tc_01_login"," @tc_02_admin"}
)

public class Testrunner {
@AfterClass
public static void extendReport()
{
Reporter.loadXMLConfig("\\src\\test\\resources\\configurationproperties\\extent-config.xml");
Reporter.setSystemInfo("user", System.getProperty("user.name"));
Reporter.setSystemInfo("os", "Windows");


}
}




