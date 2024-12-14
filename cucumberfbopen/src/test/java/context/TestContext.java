package context;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import pages.FacebookOpen_LoginPage;

public class TestContext {
	
	
	static WebDriver driver;
	
      FacebookOpen_LoginPage facebookopenloginpage;
      
      
      public WebDriver getDriver()
      {
    	  return driver;
      }
      public void setDriver(WebDriver driver)
      {
    	  this.driver=driver;
      }
      
      
      public FacebookOpen_LoginPage getFacebookOpen_Login_Step() {
  		
  		return facebookopenloginpage;
      }
      
      
      public void inintializePageObjects(WebDriver driver,Scenario scn)
      {
    	  facebookopenloginpage =new FacebookOpen_LoginPage(driver, scn);
      }
	
}
