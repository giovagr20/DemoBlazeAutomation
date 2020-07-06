package com.demoblaze.portalweb.tasks.main;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.BTN_ADD_CART;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class AddCartLaptopsDemoBlazeTask implements Task {

    private WebDriver hisBrowser;

    public AddCartLaptopsDemoBlazeTask(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(WaitUntil.the(BTN_ADD_CART, isClickable()),
                    Click.on(BTN_ADD_CART));
            hisBrowser.switchTo().alert();
            return;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static AddCartLaptopsDemoBlazeTask addCart(WebDriver hisBrowser){
        return Tasks.instrumented(AddCartLaptopsDemoBlazeTask.class, hisBrowser);
    }
}
