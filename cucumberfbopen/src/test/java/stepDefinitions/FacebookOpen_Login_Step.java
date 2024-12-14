package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import context.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FacebookOpen_LoginPage;


public class FacebookOpen_Login_Step {
	
	TestContext testContext ;
	Scenario sc;
	FacebookOpen_LoginPage page;
	
	
	String Username= "Admin";
	String Password= "admin123";
	
	public Scenario getScenario()
	{
		return sc;
	}
	public void setScenario(Scenario sc)
	{
		this.sc=sc;
	}
	public FacebookOpen_Login_Step (TestContext testContext)
	{
		this.testContext=testContext;
		this.page=testContext.getFacebookOpen_Login_Step();
	}
	 
	
	@Given("User is on the Facebook login page")
	public void user_is_on_the_facebook_login_page() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		testContext.setDriver(driver);
		testContext.inintializePageObjects(driver, sc);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("User enters {string} in the username field")
	public void user_enters_in_the_username_field(String name ) throws Throwable   {
		page=testContext.getFacebookOpen_Login_Step();
		page.enterusername(Username);
	}

	@When("User enters {string} in the password field")
	public void user_enters_in_the_password_fiel(String Pass) throws Throwable  {
		page=testContext.getFacebookOpen_Login_Step();
	    page.enterpassword(Password);
	}

	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() throws Throwable  {
		page=testContext.getFacebookOpen_Login_Step();
	    page.clickloginbutton();
	}

	@Then("User should be successfully logged in to Facebook")
	public void user_should_be_successfully_logged_in_to_facebook() throws Throwable  {
		page.loginsuccessmessage();
	}




}
