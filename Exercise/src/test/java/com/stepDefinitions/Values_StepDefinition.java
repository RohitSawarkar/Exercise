package com.stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.pages.ValuesPage;
import com.utils.MainBaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import io.cucumber.core.cli.Main;

public class Values_StepDefinition extends MainBaseClass {

	static MainBaseClass mnc;
	ValuesPage valuesPage = new ValuesPage();
	@Before
	public void setups()
	{
		MainBaseClass mnc = new MainBaseClass();
		MainBaseClass.initialization();
	}
	
	@After
	
	public void tearDown()
	{
		
		driver.close();
	}
	
		
	//First Scenario - right count of values appear on the screen
	
	@Given("User open the Browser")
	public void user_open_the_browser() {
	    
						
	}

	@Given("values Screen is appeared")
	public boolean values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    boolean ok = assert.assertEquals(title, "Values");
	    return ok;
	}

	@When("Values in the textBox appeared")
	public boolean values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	   assert.assertEquals(val1, false);
	   Boolean val2 = valuesPage.getTxtVal_2().isEmpty();
	   assert.assertEquals(val2, false);
	   Boolean val3 = valuesPage.getTxtVal_4().isEmpty();
	   assert.assertEquals(val3, false);
	   Boolean val4 = valuesPage.getTxtVal_5().isEmpty();
	   assert.assertEquals(val4, false);
	   Boolean val5 = valuesPage.getTxtVal_6().isEmpty();
	   assert.assertEquals(val5, false);
	   Boolean totalBalance = valuesPage.TxtTotalValue().isEmpty();
	   assert.assertEquals(totalBalance, false);
	   
	}

	@Then("Count displayed is correct")
	public boolean count_displayed_is_correct() {
		double val1 = valuesPage.getTxtVal_1();
		assert.assertEquals(val1, mnc.value2);
		
		double val2 = valuesPage.getTxtVal_2();
		assert.assertEquals(val2, mnc.value2);
		
		double val3 = valuesPage.getTxtVal_4();
		assert.assertEquals(val3, mnc.value3);
		
		double val4 = valuesPage.getTxtVal_5();
		assert.assertEquals(val4, mnc.value4);
		
		double val5 = valuesPage.getTxtVal_6();
		assert.assertEquals(val5, mnc.value5);
		
		double totalBalance = valuesPage.TxtTotalValue()();
		assert.assertEquals(totalBalance, mnc.TotalBalanceValue);
				
	}

	
	//second scenario for values on the screen are greater than 0
	
	@Given("User open the Browser")
	public void user_open_the_browser() {
	    
						
	}

	@Given("values Screen is appeared")
	public boolean values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    boolean ok = assert.assertEquals(title, "Values");
	    return ok;
			
	}

	@When("Values in the textBox appeared")
	public boolean values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	   assert.assertEquals(val1, false);
	   Boolean val2 = valuesPage.getTxtVal_2().isEmpty();
	   assert.assertEquals(val2, false);
	   Boolean val3 = valuesPage.getTxtVal_4().isEmpty();
	   assert.assertEquals(val3, false);
	   Boolean val4 = valuesPage.getTxtVal_5().isEmpty();
	   assert.assertEquals(val4, false);
	   Boolean val5 = valuesPage.getTxtVal_6().isEmpty();
	   assert.assertEquals(val5, false);
	   Boolean totalBalance = valuesPage.TxtTotalValue().isEmpty();
	   assert.assertEquals(totalBalance, false);
	   
	}

	@Then("Displayed values are greater than zero")
	public void displayed_values_are_greater_than_zero() {

		double val1 = valuesPage.getTxtVal_1();
		assert.assertTrue(val1>0);
		
		double val2 = valuesPage.getTxtVal_2();
		assert.assertTrue(val2>0);
		
		double val3 = valuesPage.getTxtVal_4();
		assert.assertTrue(val3>0);
		
		double val4 = valuesPage.getTxtVal_5();
		assert.assertTrue(val4>0);
		
		double val5 = valuesPage.getTxtVal_6();
		assert.assertTrue(val5>0);
		
		double totalBalance = valuesPage.TxtTotalValue()();
		assert.assertTrue(totalBalance>0);
				
	}
	
	
	//Third Scenario - the total balance is correct based on the values listed on the screen
	
	@Given("User open the Browser")
	public void user_open_the_browser() {
	    
						
	}

	@Given("values Screen is appeared")
	public boolean values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    boolean ok = assert.assertEquals(title, "Values");
	    return ok;
			
	}

	@When("Values in the textBox appeared")
	public boolean values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	   assert.assertEquals(val1, false);
	   Boolean val2 = valuesPage.getTxtVal_2().isEmpty();
	   assert.assertEquals(val2, false);
	   Boolean val3 = valuesPage.getTxtVal_4().isEmpty();
	   assert.assertEquals(val3, false);
	   Boolean val4 = valuesPage.getTxtVal_5().isEmpty();
	   assert.assertEquals(val4, false);
	   Boolean val5 = valuesPage.getTxtVal_6().isEmpty();
	   assert.assertEquals(val5, false);
	   Boolean totalBalance = valuesPage.TxtTotalValue().isEmpty();
	   assert.assertEquals(totalBalance, false);
	   
		
	}

	@When("Values displayed is summed up")
	public void values_displayed_is_summed_up() {


		double val1 = valuesPage.getTxtVal_1();
				
		double val2 = valuesPage.getTxtVal_2();
				
		double val3 = valuesPage.getTxtVal_4();
				
		double val4 = valuesPage.getTxtVal_5();
				
		double val5 = valuesPage.getTxtVal_6();
		
		double summed_up = (val1+val2+val3+val4+val5);
				
		double totalBalance = valuesPage.TxtTotalValue();
		
		
		
	}

	@Then("total Balance Value should be same as summed up value")
	public void total_balance_value_should_be_same_as_summed_up_value() {

     assert.assertEquals(summed_up, totalBalance, "The Total Balance is same after summed up of all values );
		
	}

	
	//Fourth Scenario - the values are formatted as currencies
	@Given("User open the Browser")
	public void user_open_the_browser() {
	    
						
	}

	@Given("values Screen is appeared")
	public boolean values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    boolean ok = assert.assertEquals(title, "Values");
	    return ok;
			
	}

	@When("Values in the textBox appeared")
	public boolean values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	   assert.assertEquals(val1, false);
	   Boolean val2 = valuesPage.getTxtVal_2().isEmpty();
	   assert.assertEquals(val2, false);
	   Boolean val3 = valuesPage.getTxtVal_4().isEmpty();
	   assert.assertEquals(val3, false);
	   Boolean val4 = valuesPage.getTxtVal_5().isEmpty();
	   assert.assertEquals(val4, false);
	   Boolean val5 = valuesPage.getTxtVal_6().isEmpty();
	   assert.assertEquals(val5, false);
	   Boolean totalBalance = valuesPage.TxtTotalValue().isEmpty();
	   assert.assertEquals(totalBalance, false);
	   
		
	}

	@Then("values displayed are starting with currency symbol")
	public void values_displayed_are_starting_with_currency_symbol() {

		String val1 = valuesPage.getTxtVal_1();
		
		String val2 = valuesPage.getTxtVal_2();
				
		String  val3 = valuesPage.getTxtVal_4();
				
		String  val4 = valuesPage.getTxtVal_5();
				
		String  val5 = valuesPage.getTxtVal_6();
							
		String  totalBalance = valuesPage.TxtTotalValue();
		
		assertEquals(val1.charAt(0), "$");
		assertEquals(val2.charAt(0), "$");
		assertEquals(val3.charAt(0), "$");
		assertEquals(val4.charAt(0), "$");
		assertEquals(val5.charAt(0), "$");
		assertEquals(totalBalance.charAt(0), "$");
		
	}

	
	//Fifth Scenario -  total balance matches the sum of the values
	@Given("User open the Browser")
	public void user_open_the_browser() {
	    
						
	}

	@Given("values Screen is appeared")
	public boolean values_screen_is_appeared() {
	    String title = valuesPage.getPageTitle();
	    boolean ok = assert.assertEquals(title, "Values");
	    return ok;
			
	}

	@When("Values in the textBox appeared")
	public boolean values_in_the_text_box_appeared() {
	    Boolean val1 = valuesPage.getTxtVal_1().isEmpty();
	   assert.assertEquals(val1, false);
	   Boolean val2 = valuesPage.getTxtVal_2().isEmpty();
	   assert.assertEquals(val2, false);
	   Boolean val3 = valuesPage.getTxtVal_4().isEmpty();
	   assert.assertEquals(val3, false);
	   Boolean val4 = valuesPage.getTxtVal_5().isEmpty();
	   assert.assertEquals(val4, false);
	   Boolean val5 = valuesPage.getTxtVal_6().isEmpty();
	   assert.assertEquals(val5, false);
	   Boolean totalBalance = valuesPage.TxtTotalValue().isEmpty();
	   assert.assertEquals(totalBalance, false);
	   
		
	}

	@When("Values displayed is summed up")
	public void values_displayed_is_summed_up() {


		double val1 = valuesPage.getTxtVal_1();
				
		double val2 = valuesPage.getTxtVal_2();
				
		double val3 = valuesPage.getTxtVal_4();
				
		double val4 = valuesPage.getTxtVal_5();
				
		double val5 = valuesPage.getTxtVal_6();
		
		double summed_up = (val1+val2+val3+val4+val5);
				
		double totalBalance = valuesPage.TxtTotalValue();
		
		
		
	}

	@Then("total Balance Value should be same as summed up value")
	public void total_balance_value_should_be_same_as_summed_up_value() {

     assert.assertEquals(summed_up, totalBalance, "The Total Balance is same after summed up of all values );
		
	}

	
	
	
}
