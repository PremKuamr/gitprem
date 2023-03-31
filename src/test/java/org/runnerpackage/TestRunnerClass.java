package org.runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\FeatureFolder3" , glue = "com.stepdefinitionpackage2")

public class TestRunnerClass {
	

}
   