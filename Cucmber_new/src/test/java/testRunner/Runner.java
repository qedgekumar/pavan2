package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},monochrome=true,dryRun=true,glue= {"stepdefintions"},tags= {"@addEmp"},plugin= {"pretty","html:target/Cucumber/cucumber-reports"})

public class Runner {

}
