package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/AppFeatures"},
        glue = {"stepsdefinitions", "AppHooks"}, 
        tags = "@tag1"
)
public class Runner {
}
