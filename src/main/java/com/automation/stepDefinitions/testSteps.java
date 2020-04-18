package com.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testSteps {
	@Given("^given the data$")
	public void given_the_data() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("tets the sxcenaio");
	   // throw new PendingException();
	}
	/*
	@Given("^given the data$")
	public void given_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Test");
	}*/
	/*@Given("^given the data$")
	public void giventcse() {
		System.out.println("Given Case");
	}
*/
	/*
@When("^Input is given$")
public void input_is_given() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Input is given");
}

@Then("^Login to appication$")
public void login_to_appication()  {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Login to appication");
}

@Then("^Navigate to homepage$")
public void navigate_to_homepage() {
    System.out.println("Navigate to homepage");
}

@Then("^validate page title$")
public void validate_page_title()  {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("validate page title");
}

*/
}
