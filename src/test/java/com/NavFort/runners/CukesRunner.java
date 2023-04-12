package com.NavFort.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/NavFort/step_definitions",
        dryRun = false,
        tags = //"@NAV10-495",
                "@NAV10-221",
        publish = false

)
public class CukesRunner {
}