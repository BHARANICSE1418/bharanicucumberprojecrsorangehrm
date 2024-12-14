package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import utilities.Utility;

public class FacebookOpen_LoginPage {

	
	  protected WebDriver driver;
	  Scenario scn;
	  
	  
	  By textusername=By.xpath("//input[@name='username']");
	  By textpassword=By.xpath("//input[@name='password']");
	  By loginbutton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	  
	  
	  
	  public FacebookOpen_LoginPage(WebDriver driver, Scenario scn)
	  {
		  this.driver=driver;
		  this.scn=scn;
	  }
	  
	  public void enterusername(String Username) throws InterruptedException
	  {
		  Thread.sleep(5000);
		  driver.findElement(textusername).sendKeys(Username);
	  }
	  public void enterpassword(String Password)
	  {
		  driver.findElement(textpassword).sendKeys(Password);
	  }
	  public void clickloginbutton()
	  {
		  driver.findElement(loginbutton).click();
	  }
	  
	  public void loginsuccessmessage()
	  {
		  System.out.println("login successfully");
		  driver.quit();
	  }
	  
	  
}
