package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultiScenariosParam1 {
	
	WebDriver driver = null;

	@Given("^I am on my smashing website$")
	public void shouldNavigateToMySmashingWebsite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void shouldClickOnLink(String link) throws Throwable {
		driver.findElement(By.id(link)).click();		
	}

	@Then("^I check if the page title is \"([^\"]*)\"$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue("Not on About page", driver.getTitle().equals(title));
	}
	
	@Then("^I close the old browser$")
	public void closeOldBrowser() throws Throwable {
		driver.close();
	}

}
