package com.demoblaze.portalweb.tasks.main;

import com.demoblaze.portalweb.questions.DemoBlazeMainQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebDriver;

public class TheMainPageDemoBlazeTask implements Task {

    private WebDriver hisBrowser;

    public TheMainPageDemoBlazeTask(WebDriver hisBrowser) {
        this.hisBrowser = hisBrowser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isTheMainPage = actor.asksFor(DemoBlazeMainQuestion.isTheMainPage());
        if (!isTheMainPage){
            actor.wasAbleTo(TheMainPageDemoBlazeTask.theMainPage(hisBrowser));
        }
        return;
    }

    public static TheMainPageDemoBlazeTask theMainPage(WebDriver hisBrowser){
        return Tasks.instrumented(TheMainPageDemoBlazeTask.class, hisBrowser);
    }
}
