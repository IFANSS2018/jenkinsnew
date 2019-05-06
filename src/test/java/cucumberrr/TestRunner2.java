package cucumberrr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/resources/cucumbe/",
glue= {"cucumberrr"},
plugin = { "html:target", "json:src/main/resources/JsonReport.json"},
monochrome = true)
public class TestRunner2 {

}
