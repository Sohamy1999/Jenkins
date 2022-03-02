package step_def;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.Page_Objects;

public class Login_Valid  {

	
   Page_Objects po;
   
   @Before
   public void init()
   {    
	   po = new Page_Objects();
   }
	
   @Given("user is on the login page")
   public void user_is_on_the_login_page() {
       po.gettitle();
   }

   @Given("user enters the  username {string}")
   public void user_enters_the_username(String string) {
       po.enterusername(string);
   }
   @When("user enters the  password {string}")
   public void user_enters_the_password(String string) {
       po.enterpassword(string);
   }
   @When("user clicks on the login button")
   public void user_clicks_on_the_login_button() {
       po.enterlogin();
   }
   
   @When("user Takes a screenshot")
   public void user_Takes_a_screenshot() throws IOException {
       po.takescreenshot();
   }
   


	
	
}
