package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioHooksStepDefinition {
	
	WebDriver driver = null;
	
	@Before
	public void testSetUp() {
		//System.out.println("Global Before executed");
		driver = new FirefoxDriver();
	}
	
	@After
	public void testShutDown() {
		//System.out.println("Global After executed");
		driver.quit();
	}
/*
	@Before("@web")
	public void testSetUpWeb() {
		System.out.println("Web Tag Before executed");
//		driver = new FirefoxDriver();
	}
	
	@After("@web")
	public void testShutDownWeb() {
		System.out.println("Web tag After executed");
//		driver.quit();
	}*/

	@Given("^I am on the best website$")
	public void shouldNavigateToBestWebsite() throws Throwable {
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@When("^I navigate to the operation$")
	public void clickOnOperationToCheck() throws Throwable {
		driver.findElement(By.id("operation_link")).click();		
	}

	@When("^I check for an available operation$")
	public void checkAvailableOperation() throws Throwable {
		driver.findElement(By.name("check_available")).click();		
	}

	@When("^I populate the form$")
	public void shouldPopulateForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Fefezinha Candura");
		driver.findElement(By.name("address_field")).sendKeys("Rua das Queridas");
		driver.findElement(By.name("postcode_field")).sendKeys("L3N 4J0");
		driver.findElement(By.name("email_field")).sendKeys("fefe_candura@sparklingrainbows.com");
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^There should be a confirmation message$")
	public void checkForConfirmationMessage() throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("Many thanks again"));
	}
	
}
