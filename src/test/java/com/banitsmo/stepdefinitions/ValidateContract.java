package com.banitsmo.stepdefinitions;

import com.banistmo.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ValidateContract {

    @Managed
    public static WebDriver hisBrowser;

    @Given("I am in the web page")
    public void iAmInTheWebPage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("banitsmo");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/empresas/"));

    }

    @When("I navigate to the documents section")
    public void iNavigateToTheDocumentsSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavigateTo.documentsPage());
    }

    @Then("I will see the correct document")
    public void iWillSeeTheCorrectDocument() {

    }
}
