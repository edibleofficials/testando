package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultiScenarios2StepDefinitions {
	
	WebDriver driver = null;

	@Given("^I am on the nice site$")
	public void shouldNavigateThere() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@Then("^I close the good browser$")
	public void closeGoodBrowser() throws Throwable {
		driver.close();
	}

	@When("^I click on ([^\"]*)$")
	public void clickOnNavigationLink(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	}

	@Then("^I check if I am on ([^\"]*)$")
	public void verifyTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}
}
