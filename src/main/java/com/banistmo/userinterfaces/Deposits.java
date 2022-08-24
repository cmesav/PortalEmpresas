package com.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Deposits {

    public static final Target BUSINESS_ACCOUNT = Target.the("Business Savings Account")
            .locatedBy("//*[@title='Cuenta de Ahorro Comercial']");

}
