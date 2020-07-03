package com.demoblaze.portalweb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/demoblaze_buy_laptop.feature"},
        glue = "com.demoblaze.portalweb.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class DemoBlazeBuyLaptopRunner {}
