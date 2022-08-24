package com.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Companies {

    public static final Target PRODUCTS = Target.the("Products and services")
            .locatedBy("//*[@class='dropdown-toggle']");

    public static final Target DEPOSITS = Target.the("Deposits")
            .locatedBy("//*[contains(text(),'Depósitos')]");

}
