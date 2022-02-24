package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.ResultsPage;


public class StepDef  {

    HomePage homePage = new HomePage() ;
    ResultsPage resultsPage = new ResultsPage() ;

    @Given("User opens xperthr homepage")
    public void User_opens_xperthr_homepage() {
    	homePage.launchApp(); 
    }

    @When("User submits the search with keyword 'pay'")
    public void User_submits_the_search_with_keyword() throws InterruptedException {
    	homePage.enterSearchdetails("pay");
    	homePage.clickSearchButton();
    }

    @When("List of articles displayed")
    public void List_of_articles_displayed() {
    	resultsPage.clickShowMore();
    }

    @Then("User clicks on show more")
    public void User_clicks_on_show_more() {
    	resultsPage.clickShowMore();
    }

    @Given("User clicks on Law Practise")
    public void User_clicks_on_Law_Practisee() {
    	resultsPage.clicklawReport();
    }

      
}
