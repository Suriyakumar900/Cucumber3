$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Addcustomer.feature");
formatter.feature({
  "name": "Add customer flow Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add customer flow validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_the_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fill up the details by using OneDim List",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_fill_up_the_details_by_using_OneDim_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_verifies_the_message()"
});
formatter.result({
  "status": "passed"
});
});