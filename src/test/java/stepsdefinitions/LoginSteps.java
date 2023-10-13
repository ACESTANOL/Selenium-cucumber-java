package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import factory.Driverfactory;
import Pages.login;

public class LoginSteps {
	
		private login loginPage = new login(Driverfactory.getDriver());
	
	
	   @Given("the user is on the login page")
	   public void theUserIsOnTheLoginPage() {
//	       String title = loginPage.getNewUserTitle();
//	       System.out.println("login page is title is: " + title);
//	       Assert.assertTrue(title.contains(title));
//	       throw new io.cucumber.java.PendingException();
		   
		   Driverfactory.getDriver().get("https://automationexercise.com/login");
	   }
  
	   //Test Case 2: Login User with correct email and password
	   @When("the user enters valid username {string}")
	   public void the_user_enters_valid_username(String username) {
		   loginPage.enterUserName(username);
	   }

	   @And("the user enters valid password  {string}")
	   public void theUserEntersValidPassword(String password) {
		   loginPage.enterPassword(password);
	  
	   }

	   @And("the user clicks the login button")
	   public void theUserClicksTheLoginButton() {
	      loginPage.clickOnLogin();
	      
	   }
	   
	   
	   //#Test Case 3: Login User with incorrect email and password
	   @Given("User is already on login page")
	   public void user_is_already_on_login_page() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @When("Login using incorrect creadentials")
	   public void login_using_incorrect_creadentials() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @Then("Error Your email or password is incorrect! should be displayed")
	   public void error_your_email_or_password_is_incorrect_should_be_displayed() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }
	   
	   //Test Case 4: Logout User
	   @Given("User is already logged in")
	   public void user_is_already_logged_in() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @When("Logout user")
	   public void logout_user() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @Then("User should be navigated to login page")
	   public void user_should_be_navigated_to_login_page() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }
	   
	   
	   //Test Case 5: Register User with existing email
	   @Given("User is in on Login page")
	   public void user_is_in_on_login_page() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @When("Register already registered email")
	   public void register_already_registered_email() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	   @Then("An error Email Address already exist! should be visible")
	   public void an_error_email_address_already_exist_should_be_visible() {
	       // Write code here that turns the phrase above into concrete actions
	       throw new io.cucumber.java.PendingException();
	   }

	 

}

