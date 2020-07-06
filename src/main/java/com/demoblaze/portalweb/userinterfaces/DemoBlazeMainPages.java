package com.demoblaze.portalweb.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeMainPages extends PageObject {

    public static final Target LBL_CATEGORIES = Target.the("CATEGORIES")
            .located(By.id("cat"));
    public static final Target BTN_LAPTOPS = Target.the("LAPTOPS CATEGORIES")
            .located(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/a[3]"));
    public static final Target REF_LAPTOP = Target.the("DELL I7 LAPTOP")
            .located(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/h4[1]/a[1]"));
    public static final Target LBL_DELL_LAPTOP = Target.the("DELL VALIDATION")
            .located(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/h2[1]"));
    public static final Target BTN_ADD_CART = Target.the("ADD CART")
            .located(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[2]/div[1]/a[1]"));
}
