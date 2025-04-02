package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver=new ChromeDriver();
	@Given("I am in the orenge hrm login page")
	public void i_am_in_the_orenge_hrm_login_page() {
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("The user provides a valid user id")
	public void the_user_provides_a_valid_user_id() {
	    WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
	    ele1.sendKeys("Admin");
	}

	@When("user provides a valid password")
	public void user_provides_a_valid_password() {
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
	    ele1.sendKeys("admin123");
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement ele1=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	    ele1.click();
	}

	@Then("the user can see the dashboard")
	public void the_user_can_see_the_dashboard() {
		String k=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
	    String m="Dashboard";
	    Assert.assertEquals(k,m);
	    System.out.println("success");
		
	}
}