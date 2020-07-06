package com.demoblaze.portalweb.stepdefinitions;

import com.demoblaze.portalweb.questions.DemoBlazeMainQuestion;
import com.demoblaze.portalweb.tasks.browser.NavigateDemoBlazeTask;
import com.demoblaze.portalweb.tasks.main.CategoriesDemoBlazeTask;
import com.demoblaze.portalweb.tasks.main.LaptopsCategoriesDemoBlazeTask;
import com.demoblaze.portalweb.tasks.main.TheMainPageDemoBlazeTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class DemoBlazeBuyLaptopStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor userDemoBlaze = Actor.named("userDemoBlaze");

    @Before
    public void setUp(){
        userDemoBlaze.can(BrowseTheWeb.with(hisBrowser));
        userDemoBlaze.wasAbleTo(NavigateDemoBlazeTask.intoHome());
        hisBrowser.manage().window().maximize();
    }

    @Given("^User is in the main page$")
    public void userIsInTheMainPage() {
        userDemoBlaze.wasAbleTo(TheMainPageDemoBlazeTask.theMainPage(hisBrowser));
    }

    @When("^User choose categories laptops$")
    public void userChooseCategoriesLaptops() {
        userDemoBlaze.attemptsTo(CategoriesDemoBlazeTask.chooseCategory(hisBrowser));
    }

    @When("^User chooses a new laptop mark Dell$")
    public void userChoosesANewLaptopMarkDell() {
        userDemoBlaze.attemptsTo(LaptopsCategoriesDemoBlazeTask.isLaptopsChoose(hisBrowser));
    }

    @Then("^User validates if is selectioned mark$")
    public void userValidatesIfIsSelectionedMark() {
    }

    @Then("^User adds to cart the new laptop$")
    public void userAddsToCartTheNewLaptop() {
    }
}
