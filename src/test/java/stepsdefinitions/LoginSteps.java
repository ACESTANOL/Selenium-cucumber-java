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
  
	   
	   @When("the user enters valid username {string}")
	   public void the_user_enters_valid_username(String username) {
		   loginPage.enterUserName(username);
	   }

	   @And("the user enters valid password  {string}")
	   public void theUserEntersValidPassword(String password) {
		   loginPage.enterPassword(password);
	     //  throw new io.cucumber.java.PendingException();
	   }

	   @And("the user clicks the login button")
	   public void theUserClicksTheLoginButton() {
	      loginPage.clickOnLogin();
	      // throw new io.cucumber.java.PendingException();
	   }

	 

}

