package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="src/test/resources/feature",glue="com.boots.stepDefinitions",
monochrome=true, /*tags="@Regression",*/ plugin = {
        "pretty",
        "html:target/regression.html",
        "junit:target/cucumber.xml",
        "json:target/cucumber.json",
        "rerun:target/regression-rerun.txt"})
public class Boots_Regression extends AbstractTestNGCucumberTests{

	
}
