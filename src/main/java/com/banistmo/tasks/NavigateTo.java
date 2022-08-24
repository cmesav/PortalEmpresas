package com.banistmo.tasks;

import com.banistmo.userinterfaces.BusinessAccount;
import com.banistmo.userinterfaces.Companies;
import com.banistmo.userinterfaces.Deposits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NavigateTo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Companies.PRODUCTS),
                Click.on(Companies.DEPOSITS),
                Click.on(Deposits.BUSINESS_ACCOUNT),
                Click.on(BusinessAccount.DOCUMENTS),
                WaitUntil.the(BusinessAccount.PDF,WebElementStateMatchers.isClickable()),
                Scroll.to(BusinessAccount.PDF),
                Click.on(BusinessAccount.PDF),
                Switch.toNewWindow()
        );
    }

    public static NavigateTo documentsPage(){
        return Tasks.instrumented(NavigateTo.class);
    }


}
