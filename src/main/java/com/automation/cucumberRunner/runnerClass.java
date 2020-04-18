package com.automation.cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Lalitha\\eclipse-workspace\\FreeCRMBDDCucumber\\src\\main\\java\\com\\automation\\features\\cucmberTest.feature",
		glue= {"com.automation.stepDefinitions"}
		//format= {"pretty","html:test-output"}
		
		)
public class runnerClass {

}
