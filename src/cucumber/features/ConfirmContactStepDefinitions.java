package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ConfirmContactStepDefinitions {
	
	WebDriver driver = null;

	@Given("^I am on my website$")
	public void shouldNavigateToMySite() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("file:///E:/Test/index.html");
	}

	@When("^I click on the contact link$")
	public void shouldClickOnContactLink() throws Throwable {
		driver.findElement(By.id("contact_link")).click();		
	}

	@When("^populate the contact form$")
	public void shouldPopulateContactForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Fefe fidida");
		driver.findElement(By.name("address_field")).sendKeys("Rua fedorenta");
		driver.findElement(By.name("postcode_field")).sendKeys("F3D 0R");
		driver.findElement(By.name("email_field")).sendKeys("fefe_fidida@fedo.com");
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I should be on the contact confirmation page$")
	public void checkOnContactConfirmPage() throws Throwable {
		Assert.assertTrue("Not on confirmation page", driver.getTitle().equals("Confirm page"));
	}

	
	
	@Given("^I am on Duck$")
	public void I_am_on_Duck() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("https://duckduckgo.com/");
	}

	@When("^populate the search box with 'test'$")
	public void populate_the_search_with_test_box() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("test");
	}

	@When("^I click on the search link$")
	public void I_click_on_the_search_link() throws Throwable {
		driver.findElement(By.id("search_button_homepage")).click();
	}

	@Then("^I should be on the search test page$")
	public void I_should_be_on_the_search_test_page() throws Throwable {
		Assert.assertTrue("Not on test search page", driver.getTitle().equals("test at DuckDuckGo"));
	}	
	
}
