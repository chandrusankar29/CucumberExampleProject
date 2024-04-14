package stepDefention;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/feature"},
    glue = {"stepDefention"},
    plugin = {"pretty", "html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true
    
    )


public class RunnerClass {

}
