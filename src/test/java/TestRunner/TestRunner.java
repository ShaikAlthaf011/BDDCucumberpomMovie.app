package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/Feature",glue= {"StepDefinition"},plugin={"html:target/cucumber-reports/cucumber-html-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
