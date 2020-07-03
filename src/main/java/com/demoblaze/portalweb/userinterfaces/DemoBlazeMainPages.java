package com.demoblaze.portalweb.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeMainPages extends PageObject {

    public static final Target LBL_CATEGORIES = Target.the("CATEGORIES")
            .located(By.id("cat"));
    public static final Target BTN_LAPTOPS = Target.the("LAPTOPS CATEGORIES")
            .located(By.id("itemc"));

}
