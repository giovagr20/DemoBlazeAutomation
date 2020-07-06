package com.demoblaze.portalweb.tasks.main;

import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.BTN_LAPTOPS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

public class CategoriesDemoBlazeTask implements Task {

    private WebDriver hisBrowser;

    public CategoriesDemoBlazeTask(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(MoveMouse.to(BTN_LAPTOPS),
                    DoubleClick.on(BTN_LAPTOPS));
            return;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static CategoriesDemoBlazeTask chooseCategory(WebDriver hisBrowser){
        return Tasks.instrumented(CategoriesDemoBlazeTask.class, hisBrowser);
    }
}
