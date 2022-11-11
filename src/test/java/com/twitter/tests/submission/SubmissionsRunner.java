package com.twitter.tests.submission;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/com/twitter/tests/submission/submission.feature",
        glue = {"com.twitter.tests"},
        plugin = {"html:reports/Home-Report.html"},
        monochrome = true
)

public class SubmissionsRunner extends AbstractTestNGCucumberTests {
}