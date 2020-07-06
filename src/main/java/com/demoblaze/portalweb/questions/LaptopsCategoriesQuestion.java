package com.demoblaze.portalweb.questions;

import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.REF_LAPTOP;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaptopsCategoriesQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(REF_LAPTOP).viewedBy(actor).asString().equals("Dell i7 8gb");
    }

    public static LaptopsCategoriesQuestion isLabelActive(){
        return new LaptopsCategoriesQuestion();
    }
}
