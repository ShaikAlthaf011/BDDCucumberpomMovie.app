package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/Feature",glue= {"StepDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
