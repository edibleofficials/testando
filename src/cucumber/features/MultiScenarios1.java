package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultiScenarios1 {
	
	WebDriver driver = null;

	@Given("^I am on my funky website$")
	public void shouldNavigateToMyFunkyWebsite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@When("^I navigate to Operation$")
	public void shouldClickOnOperation() throws Throwable {
		driver.findElement(By.id("operation_link")).click();		
	}

	@Then("^I check if the page title is Operation$")
	public void checkForOperationOnPageTitle() throws Throwable {
		Assert.assertTrue("Not on Operation page", driver.getTitle().equals("Operation"));
	}

	@Then("^I close the browser$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

	@When("^I navigate to About$")
	public void shouldClickOnAbout() throws Throwable {
		driver.findElement(By.id("about_link")).click();		
	}

	@Then("^I check if the page title is About$")
	public void checkForAboutOnPageTitle() throws Throwable {
		Assert.assertTrue("Not on About page", driver.getTitle().equals("About"));
	}

	@When("^I navigate to Contact$")
	public void shouldClickOnContact() throws Throwable {
		driver.findElement(By.id("contact_link")).click();		
	}

	@Then("^I check if the page title is Contact$")
	public void checkForContactOnPageTitle() throws Throwable {
		Assert.assertTrue("Not on Contact page", driver.getTitle().equals("Contact"));
	}


}
