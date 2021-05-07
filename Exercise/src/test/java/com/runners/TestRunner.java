package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\git\\Exercise\\Exercise\\src\\test\\java\\com\\features\\values.feature",
		glue = {"C:\\Users\\Admin\\git\\Exercise\\Exercise\\src\\test\\java\\com\\stepDefinitions\\Values_StepDefinition.java"},
		monochrome = true,
		dryRun = true
		)

public class TestRunner {

}
