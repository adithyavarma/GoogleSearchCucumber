package com.google_search.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/admin/eclipse-workspace/GoogleSearch/src/main/java/com/google_search/features/search.feature",
		glue = {"com.google_search.stepDefinitions"},
		plugin = {"pretty","html:target/test-output"}
		)

public class TestRunner {

}
