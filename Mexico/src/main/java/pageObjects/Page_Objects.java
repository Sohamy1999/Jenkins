package pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Connection;
import cucumber.api.Scenario;

public class Page_Objects extends Connection {
	
	
//.......................................................LOGIN_Elements.............................................................................
	
	
	@FindBy(xpath ="//*[@id=\"USER\"]")
	WebElement username ;
	
	@FindBy(xpath ="//*[@id=\"PASSWORD\"]")
	WebElement password ;
	
	
	@FindBy(xpath = "//*[@id=\"loginFormSubmit\"]")
	WebElement login ;
	

//..................................................Forget_Username_Elements........................................................................	
	
	
	@FindBy(xpath = "//*[@id=\"forgotUsername\"]")
	WebElement forget_username ;
	
	@FindBy(xpath = "//*[@id=\"UsernameEmail\"]")
	WebElement enter_email_address ;
	
	@FindBy(xpath = "//*[@id=\"UsernameConfirmEmail\"]")
	WebElement confirm_email_address ;
	
	@FindBy(xpath = "//div[@role=\"presentation\"][2]")
	WebElement notrobot_check ;
	
	@FindBy(xpath = "//*[@id=\"forgotUsernameConfirmSubmitted\"]")
	WebElement next ;
	
	
//..................................................Forget_Password_Elements..........................................................................
	
	
	@FindBy(xpath = "//*[@id=\"forgotPassword\"]")
	WebElement forget_password ;

	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement enter_user_ID ;

	@FindBy(xpath = "//*[@id=\"confirmEmail\"]")
	WebElement confirm_user_ID ;
	

//..................................................Screenshot............................................................................
	
	public void takescreenshot() throws IOException {
		
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\SDEEPAKY\\Downloads\\Mexico\\Screenshot\\img.png");
			FileHandler.copy(src, des);
		
	}
	

//..........................................................................................................................................
	
	
	public Page_Objects()
	{   
		setup();
		PageFactory.initElements(driver, this);
		
	}
	

	
	
	
	
	public void gettitle()
	{
		driver.getTitle();
	}
	
	public void enterusername(String name )
	{
		username.sendKeys(name);
	}
	
	public void enterpassword(String pass)
	{   
		password.sendKeys(pass);	
	}
	
	
	public void enterlogin()
	{  	
		login.click();
	}
	
	
	
	
	
	
	
	public void forget_username()
	{  	
		forget_username.click();
	}
	
	public void enter_email(String email)
	{  	
		enter_email_address.sendKeys(email);
	}
	
	public void confirm_email(String email)
	{  	
		confirm_email_address.sendKeys(email);
	}
	
	public void robot_check()
	{  	
		notrobot_check.click();
	}
	
	public void next()
	{  	
		next.click();
	}
	
	
	
	
	
	
	
	public void forget_password()
	{  	
		forget_password.click();
	}
	
	public void enter_user_id(String userID)
	{  	
		enter_user_ID.sendKeys(userID);
	}
	
	public void confirm_user_id(String email)
	{  	
		confirm_user_ID.sendKeys(email);
	}
	
	


}
