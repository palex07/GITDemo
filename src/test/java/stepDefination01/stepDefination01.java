package stepDefination01;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination01 {

    @Given("^user is on opty page$")
    public void user_is_on_opty_page() throws Throwable {
        throw new PendingException();
    }
// Using Datatable for datadriven
    
    @When("^enter all the required fields for opty details below and click submit$")
    public void enter_all_the_required_fields_for_opty_details_below_and_click_submit(DataTable data) throws Throwable {
    
    	List<List<String>> obj= data.raw();
    	
  System.out.println(obj.get(0).get(0));
  System.out.println(obj.get(0).get(1));
  throw new PendingException();
  
    }

    @Then("^opty creation sucessfull$")
    public void opty_creation_sucessfull() throws Throwable {
        throw new PendingException();
    }

    @And("^moved to procing page$")
    public void moved_to_procing_page() throws Throwable {
        throw new PendingException();
    }

}