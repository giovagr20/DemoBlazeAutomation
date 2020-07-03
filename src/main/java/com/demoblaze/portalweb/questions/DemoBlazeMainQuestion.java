package com.demoblaze.portalweb.questions;

import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.LBL_CATEGORIES;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class DemoBlazeMainQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LBL_CATEGORIES).viewedBy(actor).asString().equals("CATEGORIES");
    }

    public static DemoBlazeMainQuestion isTheMainPage(){
        return new DemoBlazeMainQuestion();
    }
}
