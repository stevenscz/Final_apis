package co.com.globallogic.certification.apis.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/getApis.feature",

        glue = {"co/com/globallogic/certification/apis/stepdefinitions",
                "co/com/globallogic/certification/apis/setup"},

        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Apis {
}
