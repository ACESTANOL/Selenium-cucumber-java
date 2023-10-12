package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	private WebDriver driver;
	//1. Locators
	private By btnSignUpAndLogin = By.xpath("//a[normalize-space()='Signup / Login']");
	private By newUserSignup = By.xpath("//h2[normalize-space()='New User Signup!']");
	private By newName = By.xpath("//input[@placeholder='Name']");
	private By signupEmail = By.xpath("//input[@data-qa='signup-email']");
	private By signupButton = By.xpath("//button[normalize-space()='Signup']");
	private By loginlabel = By.xpath("//h2[normalize-space()='Login to your account']");
	private By emaillogin = By.xpath("//input[@data-qa='login-email']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By loginbtn = By.xpath("//button[normalize-space()='Login']");
	private By loginerr = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
	private By regerr = By.xpath("//p[normalize-space()='Email Address already exist!']");
	private By loginsuccess = By.xpath("//li[10]//a[1]");
	
	
	//2.Constructor to receive the WebDriver instance
    public login(WebDriver driver) {
        this.driver = driver;
    }
	
	//3. page actions: features(behavior) of the page the form of methods:
    
    public String getLoginPageTitle() {
    	return driver.getTitle();
    }
    
    public void enterUserName(String username) {
    	driver.findElement(emaillogin).sendKeys(username);
    }
    
    public void enterPassword(String pwd) {
    	driver.findElement(password).sendKeys(pwd);
    }
    
    public void clickOnLogin() {
    	driver.findElement(loginbtn).click();
    }
    
    
    
    

	
 

   
}
