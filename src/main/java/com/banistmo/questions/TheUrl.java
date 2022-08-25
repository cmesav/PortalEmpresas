package com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class TheUrl implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = getDriver();
        return driver.getCurrentUrl();
    }

    public static TheUrl ofDocument(){
        return new TheUrl();
    }
}
