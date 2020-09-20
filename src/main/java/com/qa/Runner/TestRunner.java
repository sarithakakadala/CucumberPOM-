package com.qa.Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\HybridFramework\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\login.feature", //the path of the feature files
		glue={"com/qa/stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_otput/cucumber.xml"},//result file
		dryRun=false, //step definition mapping if its value is true
		monochrome=true //display cosole output in readable format
		//tags = {"~@SmokeTest","@RegressionTest"}
		)
public class TestRunner {

}
