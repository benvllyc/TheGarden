package testrunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = {"stepdefinitions"})

public class CareersSmoke {
//Right click here and Run As JUnit test. . .
}