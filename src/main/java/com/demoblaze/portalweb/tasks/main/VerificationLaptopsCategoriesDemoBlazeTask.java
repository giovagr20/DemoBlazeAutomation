package com.demoblaze.portalweb.tasks.main;

import com.demoblaze.portalweb.questions.LaptopsDellCategoriesQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class VerificationLaptopsCategoriesDemoBlazeTask implements Task {

    private WebDriver hisBrowser;

    public VerificationLaptopsCategoriesDemoBlazeTask(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isVerified = actor.asksFor(LaptopsDellCategoriesQuestion.verificationDell());
        if (!isVerified){
            actor.attemptsTo(VerificationLaptopsCategoriesDemoBlazeTask.isVerified(hisBrowser));
        }
        return;
    }

    public static VerificationLaptopsCategoriesDemoBlazeTask isVerified(WebDriver hisBrowser){
        return Tasks.instrumented(VerificationLaptopsCategoriesDemoBlazeTask.class, hisBrowser);
    }
}
