package bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = {"bdd/steps"},
        plugin = {"pretty", "html:test-outout", "junit:junit_sml/cucumber.xml"}, monochrome = true, strict = true, dryRun = false
)

public class LoginRunner {

}
