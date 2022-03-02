package step_def;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class Forget_Username {
	
	Page_Objects po;
	   
	   @Before
	   public void init()
	   {    
		   po = new Page_Objects();
	   }
	   
	   @Given("user is on the login page1")
	   public void user_is_on_the_login_page() {
	       po.gettitle();
	   }
	   
	   @When("user clicks on forget username")
	   public void user_clicks_on_forget_username() {
	      po.forget_username();
	   }

	   @And("User enters e-mail address {string}")
	   public void user_enters_e_mail_address(String string) {
	       po.enter_email(string);
	   }

	   @And("User confirms e-mail address {string}")
	   public void user_confirms_e_mail_address(String string) {
		   po.confirm_email(string);
	   }

	   @Then("User checks the I am not a robot box")
	   public void user_checks_the_I_am_not_a_robot_box() {
	       po.robot_check();
	   }

	   @Then("User clicks the next button")
	   public void user_clicks_the_next_button() {
	       po.next();
	   }

}
