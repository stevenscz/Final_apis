package co.com.globallogic.certification.apis.tasks;

import co.com.globallogic.certification.apis.models.api3.User;
import co.com.globallogic.certification.apis.utils.Constantes;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class GetUserDetail implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset();//Resetear el ambiente/servicio/cache
        actor.attemptsTo(
                Get.resource(String.format(Constantes.URL_GET_USER_DETAIL))
                        .with(request -> request.header("Content-Type","application/json"))
        );
        System.out.println("Código de respuesta para la API getUserDetailByEmail es: "+SerenityRest.lastResponse().statusCode());
        System.out.println("Cuerpo de la respuesta para la API getUserDetailByEmail es: "+SerenityRest.lastResponse().body().asString());

    }

    public static GetUserDetail getUserDetail(){
        return Tasks.instrumented(GetUserDetail.class);
    }

}
