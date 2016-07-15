package cucumber.features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ScenarioDataTableStepDefinitions {
	
	WebDriver driver = null;
	
	@Given("^I am on the cool site$")
	public void shouldNavigateToCoolSite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@When("^I navigate to the contact form page$")
	public void shouldClickOnContactPageLink() throws Throwable {
		driver.findElement(By.id("contact_link")).click();		
	}

	@When("^I submit the form filled with data$")
	public void shouldFillAndSubmitForm(DataTable table) throws Throwable {
		
		//populates a list with the data from table
		List<List<String>> data = table.raw();
		
		driver.findElement(By.name(data.get(1).get(1))).sendKeys(data.get(1).get(2));
		driver.findElement(By.name(data.get(2).get(1))).sendKeys(data.get(2).get(2));
		driver.findElement(By.name(data.get(3).get(1))).sendKeys(data.get(3).get(2));
		driver.findElement(By.name(data.get(4).get(1))).sendKeys(data.get(4).get(2));
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I check that the form has been submitted$")
	public void checkPageTitleForContactSubmission() throws Throwable {
		Assert.assertTrue("Not on confirmation page", driver.getTitle().equals("Confirm page"));
	}
}
