package mphasis.FirstCry.testSteps;


import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.Itestlisner;
@CucumberOptions(
    features = "Features//myprofile.feature", // Path to your feature file
    glue = "mphasis.FirstCry.testSteps", // Path to your step definitions
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true
)
@Listeners(Itestlisner.class)
public class TestRunner extends AbstractTestNGCucumberTests {
    // This class will be empty, but you can add hooks or additional configurations if needed.
}
