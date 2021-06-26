package com.telecom.stepdefinition;

import comm.telecom.resources.CommonActtions;
import cucumber.api.java.Before;

public class Hooks extends CommonActtions{
	
	@Before
	public void beforeScenrio() {
		user_launches_the_application("http://www.demo.guru99.com/telecom/addcustomer.php");
		
	}

	
}
