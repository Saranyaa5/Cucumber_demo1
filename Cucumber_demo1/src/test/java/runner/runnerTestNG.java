package runner;

import io.cucumber.testng.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	    plugin = {"pretty", "json:target/cucumber-reports/CucumberForSauceDemoForTestNG.json"}, 
	    features = {
	        "src/test/resources/com/features/SaucedemoLogin.feature","src/test/resources/com/features/NewSuuceDemoLongin.feature"
	    },
	    glue = "stepDefinitions" ,monochrome=true, dryRun=false
	   )
	public class runnerTestNG extends AbstractTestNGCucumberTests {
	}