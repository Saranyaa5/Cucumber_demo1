package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(plugin= {"pretty" , "json:target/cucumber-reports/CucumberForSauceDemoForTestNG.json" }, 
features="src/test/resources/com/features/SaucedemoLogin.feature" , 
glue="stepDefinitions")
public class runnerTestNG extends AbstractTestNGCucumberTests {

}