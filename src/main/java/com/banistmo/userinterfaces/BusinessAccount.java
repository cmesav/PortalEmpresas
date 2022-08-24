package com.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessAccount {

    public static final Target DOCUMENTS = Target.the("Documents")
            .locatedBy("//*[contains(text(),'Documentos')]");

    public static final Target PDF = Target.the("PDF")
            .locatedBy("//*[contains(@title,'Contrato Único')]");

}
