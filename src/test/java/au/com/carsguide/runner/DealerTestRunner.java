package au.com.carsguide.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/finddealer.feature",
        glue = "au/com/carsguide",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class DealerTestRunner {

}
