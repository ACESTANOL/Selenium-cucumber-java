package stepsdefinitions;

import Pages.login;
import factory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import Pages.ContactUsPage;

public class ContactUsSteps {
	
	private ContactUsPage contactusPage = new ContactUsPage(Driverfactory.getDriver());
	
	@Given("User is on Contact Us page")
	public void user_is_on_contact_us_page() {
	   String title = contactusPage.getcontactustitle();
       System.out.println("Contact us page is title is: " + title);
	   Assert.assertTrue(title.contains(title));
   
	}

	@When("Submit message")
	public void submit_message() {
		contactusPage.submitMessage("Angel", "test@yopmail.com", "Test", "HelloTest", null);
		
	}

	@Then("Success message should be visible")
	public void success_message_should_be_visible() {
		
		contactusPage.getSuccessMsg();
	}

}
