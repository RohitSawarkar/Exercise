package com.stepDefinitions;

import com.pages.ValuesPage;
import com.utils.MainClass;

import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class Values_StepDefinition extends MainClass {

	ValuesPage valuesPage = new ValuesPage();
	
	//First Scenario
	
	@Given("Browser is opened")
	public void browser_is_opened() {
	    
		MainClass.initialization();
		
		
	}

	@Given("values Screen is appeared")
	public void values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    Assert.assertEquals("values", title);
	}

	@When("Values in the textBox appeared")
	public void values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	    Assert.assertFalse(false);
	}

	@Then("Count displayed is correct")
	public void count_displayed_is_correct() {
	    String val1 = valuesPage.getTxtVal_1();
		Assert.assertEquals("$122,365.24", val1);
	}

	
	//second scenario
//	
//	@Given("Browser is opened")
//	public void browser_is_opened() {
//	   
//	}
//
//	@Given("values Screen is appeared")
//	public void values_screen_is_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values in the textBox appeared")
//	public void values_in_the_text_box_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Displayed values are greater then {int}")
//	public void displayed_values_are_greater_then(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	
//	//Third Scenario
//	
//	@Given("Browser is opened")
//	public void browser_is_opened() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("values Screen is appeared")
//	public void values_screen_is_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values in the textBox appeared")
//	public void values_in_the_text_box_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values displayed is summed up")
//	public void values_displayed_is_summed_up() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("total Balance Value should be same as summed up value")
//	public void total_balance_value_should_be_same_as_summed_up_value() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
//	//Fourth Scenario 
//	@Given("Browser is opened")
//	public void browser_is_opened() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("values Screen is appeared")
//	public void values_screen_is_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values in the textBox appeared")
//	public void values_in_the_text_box_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("values displayed are starting with currency symbol")
//	public void values_displayed_are_starting_with_currency_symbol() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
//	//Fifth Scenario
//	@Given("Browser is opened")
//	public void browser_is_opened() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("values Screen is appeared")
//	public void values_screen_is_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values in the textBox appeared")
//	public void values_in_the_text_box_appeared() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Values displayed is summed up")
//	public void values_displayed_is_summed_up() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("total Balance Value should be same as summed up value")
//	public void total_balance_value_should_be_same_as_summed_up_value() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
//	
	//driver.close();
	
}
