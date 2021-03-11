package stepDefinitions;

import com.utilties.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.homePage;
import pageObjects.resultsPage;

public class stepDefinitions extends Testbase {
	homePage h=null;
	
	@Given("^Launch browser and navigate to url\\.$")
	public void launch_browser_and_navigate_to_url() throws Throwable {
		driver=launchUrl();
	}

	@Then("^Enter ducks in the searchbox\\.$")
	public void enter_ducks_in_the_searchbox() throws Throwable {
		h=new homePage(driver);
		h.textBox();
	}

	@Then("^Click on the search button\\.$")
	public void click_on_the_search_button() throws Throwable {
		h.searBox();
	}

	@Then("^Validate the results obtained$")
	public void validate_the_results_obtained() throws Throwable {
		resultsPage r=new resultsPage(driver);
		r.results();
		driver.quit();
	}

}
