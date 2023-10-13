package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.File;

//import com.testdata.LoginAndRegistrationStepsTestData;

public class ContactUsPage {
	private WebDriver driver;
	//private LoginAndRegistrationStepsTestData data = new LoginAndRegistrationStepsTestData();

	// 1. Constructor of the page class:
	public ContactUsPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	// 2. By Locators:
	private By contactusttitle = By.xpath("//h2[normalize-space()='Get In Touch']");
	private By name = By.xpath("//input[@placeholder='Name']");
	private By email = By.xpath("//input[@placeholder='Email']");
	private By subject = By.xpath("//input[@placeholder='Subject']");
	private By message = By.xpath("//textarea[@id='message']");
	private By choosefile = By.xpath("//input[@name='upload_file']");
	private By submit = By.xpath("//input[@name='submit']");
	private By success = By.xpath("//div[@class='status alert alert-success']");
	
	// 3. page action: features(behavior) of the page the form of methods:
	public String getcontactustitle() {
		return driver.findElement(contactusttitle).getText();
		
	}
	
	public void submitMessage(String existingName, String existingemail, String subj, String msg, String fileupload) {
		driver.findElement(name).sendKeys(existingName);
		driver.findElement(email).sendKeys(existingemail);
		driver.findElement(subject).sendKeys(subj);
		driver.findElement(message).sendKeys(msg);
		driver.findElement(choosefile).sendKeys(fileupload);
		driver.findElement(submit).click();
		driver.switchTo().alert().accept();
	}
	
	public String getSuccessMsg() {
		return driver.findElement(success).getText();
	}
	

}
