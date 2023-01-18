package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit

@CucumberOptions(features="src/test/resources/feature",glue="com.boots.stepDefinitions",
monochrome=true, plugin= {"html:target/cucumber.html"})
public class Boots_Smoke extends AbstractTestNGCucumberTests{

	
}
