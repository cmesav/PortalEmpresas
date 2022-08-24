package com.banitsmo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/validate_contract.feature",
        glue = "com.banitsmo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = ""
)
public class ValidateContractRunner {
}
