package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
                 glue= {"stepDefinitions"},
                 plugin= { "pretty","html:target/html/","json:target/json/file.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
                 tags= "@Facebookopen",
                 monochrome= true
                 )

public class TestRunner {
	
	

}
