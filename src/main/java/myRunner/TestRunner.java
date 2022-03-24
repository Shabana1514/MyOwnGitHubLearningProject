package myRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\abdul\\java\\cucumberPractice\\Feautures\\LoginFile.feature",
glue={"myStepDefinitions"},
monochrome=true, plugin={"pretty","json:json_output/cucumber.json"})

public class TestRunner {
	

}
