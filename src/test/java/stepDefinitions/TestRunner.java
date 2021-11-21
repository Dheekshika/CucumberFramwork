package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/kirub/eclipse-workspace/cucumberFramework/src/test/resources/features",glue={"stepDefinitions"},
monochrome=true,
plugin={"pretty","junit:target/Reports/Report.xml"}
		)
public class TestRunner {

}
