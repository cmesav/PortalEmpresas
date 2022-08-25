package com.banitsmo.stepdefinitions;

import com.banistmo.exceptions.FileError;
import com.banistmo.questions.TheUrl;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ValidateContract {

    @Managed
    public static WebDriver hisBrowser;

    @Given("I am in the web page")
    public void iAmInTheWebPage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActorCalled("banitsmo");
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/empresas/")
        );

    }

    @When("I navigate to the documents section")
    public void iNavigateToTheDocumentsSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                NavigateTo.documentsPage()
        );
    }

    @Then("I will see the document {string}")
    public void iWillSeeTheDocument(String documentName) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                        TheUrl.ofDocument(), containsString(documentName)
                ).orComplainWith(FileError.class, "The file is incorrect")
        );
    }
}
