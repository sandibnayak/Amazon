package step_defination;

import cucumber.api.java.en.*;
import utility.amz_utility;

public class Login{
	
	
	@Given("^I am in home_page$")
	public void i_am_in_home_page() {
		amz_utility.launchBrowser();
		amz_utility.loadUrl("https://www.amazon.in/");
	}

	@When("^I wlll enter my credentila and submit with (.*) & (.*)$")
	public void i_wlll_enter_my_credentila_and_submit_with(String arg1, String arg2) {
		System.out.println("dfhvdhfvd");
	}

	@Then("^I verify the homepage$")
	public void i_verify_the_homepage() {
		System.out.println("dfhdvfj");
	}
}
