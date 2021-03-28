package test.java.unsplash.runners;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"unsplash/steps"}
)

public class UnsplashRunner {
}
