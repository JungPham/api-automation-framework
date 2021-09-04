package unsplash.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"unsplash/steps"}
)

public class UnsplashRunner {
}