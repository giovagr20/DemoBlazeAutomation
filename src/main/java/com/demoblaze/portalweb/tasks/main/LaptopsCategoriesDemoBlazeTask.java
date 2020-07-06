package com.demoblaze.portalweb.tasks.main;

import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.REF_LAPTOP;

import com.demoblaze.portalweb.questions.LaptopsCategoriesQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.WebDriver;

public class LaptopsCategoriesDemoBlazeTask implements Task {

    private WebDriver hisBrowser;

    public LaptopsCategoriesDemoBlazeTask(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            boolean isLabelActive = actor.asksFor(LaptopsCategoriesQuestion.isLabelActive());
            if(!isLabelActive){
                actor.attemptsTo(LaptopsCategoriesDemoBlazeTask.isLaptopsChoose(hisBrowser));
            }
            actor.attemptsTo(Scroll.to(REF_LAPTOP).andAlignToTop(),
                    Click.on(REF_LAPTOP));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static LaptopsCategoriesDemoBlazeTask isLaptopsChoose(WebDriver hisBrowser){
        return Tasks.instrumented(LaptopsCategoriesDemoBlazeTask.class, hisBrowser);
    }
}
