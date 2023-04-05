package NavFort.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "NavFort/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}

