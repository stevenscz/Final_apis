package co.com.globallogic.certification.apis.tasks;

import co.com.globallogic.certification.apis.utils.Constantes;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class GetBrandsList implements Task {

@Override
public <T extends Actor> void performAs(T actor) {
    SerenityRest.reset();//Resetear el ambiente/servicio/cache
    actor.attemptsTo(
            Get.resource(String.format(Constantes.URL_BRANDS_LIST))
                    .with(request -> request.header("Content-Type","application/json"))
    );
    System.out.println("Código de respuesta para la API BrandsList es: "+SerenityRest.lastResponse().statusCode());
    System.out.println("Cuerpo de la respuesta para la API BrandsList es: "+SerenityRest.lastResponse().body().asString());

}
    public static GetBrandsList getBrandsList(){
        return Tasks.instrumented(GetBrandsList.class);
    }


}
