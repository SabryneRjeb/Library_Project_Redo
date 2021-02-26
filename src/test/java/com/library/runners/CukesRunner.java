package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

                "html:target/cucumber-report.html",// html format report for my tests
                "json:target/cucumber.json", // more clear report in Json format (javaScript)
                "rerun:target/rerun.txt"  // where my failed tests are stored in .txt file

        },
        features = "src/test/resources/features",
        glue = "com/library/steps_definitions",
        dryRun = false,
        tags = "@login"
)

public class CukesRunner {
}
