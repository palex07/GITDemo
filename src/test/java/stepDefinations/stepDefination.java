package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class stepDefination {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Cucumber 1st step");
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
        System.out.println(arg2); 
    }

    @Then("^homepage is populated$")
    public void homepage_is_populated1() throws Throwable {
    	System.out.println("Cucumber 3rd step");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed1() throws Throwable {
    	System.out.println("Cucumber 4th step");
    }

    @Given("^User is on netbanking landing page1$")
    public void user_is_on_netbanking_landing_page1() throws Throwable {
        throw new PendingException();
    }

    @When("^User login into application  (.+)and (.+) $")
    public void user_login_into_application_and(String username, String password) throws Throwable {
        throw new PendingException();
    }

    @Then("^homepage is populated now$")
    public void homepage_is_populated_now() throws Throwable {
        throw new PendingException();
    }

    @And("^Cards are displayed now$")
    public void cards_are_displayed_now() throws Throwable {
        throw new PendingException();
    }
}


