package co.com.globallogic.certification.apis.stepdefinitions;

import co.com.globallogic.certification.apis.tasks.GetBrandsList;
import co.com.globallogic.certification.apis.tasks.GetProductsList;
import co.com.globallogic.certification.apis.tasks.GetUserDetail;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApisSteps {

    @Cuando("El usuario llama la API")
    public void elUsuarioLlamaLaAPI() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("API 1: BRANDS_LIST");
        System.out.println("-----------------------------------------------------------------");
        theActorInTheSpotlight().attemptsTo(GetBrandsList.getBrandsList());

        System.out.println("-----------------------------------------------------------------");
        System.out.println("API 2: PRODUCTS_LIST");
        System.out.println("-----------------------------------------------------------------");
        theActorInTheSpotlight().attemptsTo(GetProductsList.getProductsList());

        System.out.println("-----------------------------------------------------------------");
        System.out.println("API 3: GET_USER_DETAILS_BY_EMAIL (stevens.caicedo@gmail.com)");
        System.out.println("-----------------------------------------------------------------");
        theActorInTheSpotlight().attemptsTo(GetUserDetail.getUserDetail());

    }

    @Entonces("Deberia ver el cuerpo del JSON exitosamente")
    public void deberiaVerElCuerpoDelJSONExitosamente() {
    }

}
