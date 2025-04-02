//package runner;
//
//import io.cucumber.testng.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//
//
//@CucumberOptions(plugin="pretty",features="src/test/resources/com/features/Login.feature",glue="stepDefinitions")
//public class Runner extends AbstractTestNGCucumberTests {
//
//}
package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},features="src/test/resources/com/features/Login.feature",glue="stepDefinitions")
public class Runner extends  AbstractTestNGCucumberTests{

}