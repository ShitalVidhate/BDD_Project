package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\FeatureFile\\TestSuite01.feature","src\\FeatureFile\\TestSuite02.feature"},glue= {"StepDefinitions"})
public class TestRunner {
	

	
}
