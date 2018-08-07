#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.cucumber;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ${groupId}.pages.HomePage;
import ${groupId}.pages.TestBase;

public class Stepdefs extends TestBase  {

	HomePage homePage;
	
	@Given("^a user is on Google Home Page with Chrome browser$")
	public void a_user_is_on_Google_Home_Page_with_Chrome_browser() {
		initCucumberTests();
		webDriver.get(websiteUrl);
		homePage = PageFactory.initElements(webDriver, HomePage.class);
	}
	
	@When("^he searches for \"(.*)\"$")
	public void he_searches_for(String arg1) throws InterruptedException {
		
		//TODO: input the "squashtest" into the search field and press search button
	}
	
	@When("^he chooses the first link$")
	public void he_chooses_the_first_link() {
		//TODO: choose the first result appeared
	}
	
	@Then("^he is navigated to \"(.*)\" website$")
	public void he_is_navigated_to_website(String url) {
		//TODO: verify if the title of the page appeared is www.squashtest.org/fr...
	}
	
	@When("^he changes to the English version$")
	public void he_changes_to_the_English_version() {
		//TODO: click to the English link in the www.squashtest.org/fr page
		tearDownCucumberTests();
	}
}
