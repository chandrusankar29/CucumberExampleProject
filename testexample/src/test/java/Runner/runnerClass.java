package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/feature"},
    glue = {"Stepdefention","hooks"},
    plugin = {"pretty", "html:target/cucumber-reports"}
//    tags = "@Setup,@Logout"
)
public class runnerClass {
	

}
