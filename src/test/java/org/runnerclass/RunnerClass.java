package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium\\eclipse-workspace\\GitShareAmazon\\FeatureFiles\\exampleamazon.feature",
				glue = "org.stepdefinitions", dryRun = true)
public class RunnerClass {

}
