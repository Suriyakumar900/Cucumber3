package com.telecom.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.telecom.objectrepository.AddCustomerPage;

import comm.telecom.resources.CommonActtions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps extends CommonActtions {

	CommonActtions c = new CommonActtions();
	AddCustomerPage a = new AddCustomerPage();
	

	@Given("user clicks the add customer button")
	public void user_clicks_the_add_customer_button() {
	    c.button(a.getAddcustomerbutton());
	}

	@When("user fill up the details by using OneDim List")
	public void user_fill_up_the_details_by_using_OneDim_List() {
		c.insertText(a.getFname(), "suriya");
		c.insertText(a.getLname(), "kumar");
		c.insertText(a.getEmaile(), "suriya@gmail.com");
		c.insertText(a.getAddr(), "tvt");
		c.insertText(a.getTelephoneno(), "12345678");
	    
	}

	@When("user clicks the submit button")
	public void user_clicks_the_submit_button() {
	    c.button(a.getSubmit());
	}

	@Then("user verifies the message")
	public void user_verifies_the_message() {
		String text = a.getMessage().getText();
		System.out.println(text);
	
}}
