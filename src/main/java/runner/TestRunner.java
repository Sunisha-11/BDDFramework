package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:/Users/lenovo/IdeaProjects/BDDAutomation2023/src/test/resources/featurefiles/crmloginpage.feature",

glue = "stepdefination"
)

public class TestRunner {
}
