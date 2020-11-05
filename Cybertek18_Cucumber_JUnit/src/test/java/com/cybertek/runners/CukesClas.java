package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/cybertek/Step_Definitions",
        dryRun = false,
        tags = "@librarian"
    )

    public class CukesClas {
}
