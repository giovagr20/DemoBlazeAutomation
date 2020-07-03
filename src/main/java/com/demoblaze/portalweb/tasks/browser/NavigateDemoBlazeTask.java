package com.demoblaze.portalweb.tasks.browser;

import com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigateDemoBlazeTask implements Task {

    DemoBlazeMainPages demoBlazeMainPages;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(OpenTheBrowserTask.openURL(demoBlazeMainPages));
    }

    public static NavigateDemoBlazeTask intoHome(){
        return Tasks.instrumented(NavigateDemoBlazeTask.class);
    }
}
