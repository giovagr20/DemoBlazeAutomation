package com.demoblaze.portalweb.questions;

import static com.demoblaze.portalweb.userinterfaces.DemoBlazeMainPages.LBL_DELL_LAPTOP;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaptopsDellCategoriesQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LBL_DELL_LAPTOP).viewedBy(actor).asString().contains("Dell");
    }

    public static LaptopsDellCategoriesQuestion verificationDell(){
        return new LaptopsDellCategoriesQuestion();
    }
}
