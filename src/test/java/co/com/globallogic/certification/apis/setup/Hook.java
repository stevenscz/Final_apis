package co.com.globallogic.certification.apis.setup;

import co.com.globallogic.certification.apis.utils.Constantes;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast()); //Se inicializa el scenario
        theActorCalled("Stevens");
        theActorInTheSpotlight().whoCan(CallAnApi.at(Constantes.URL_BASE));
    }
}
