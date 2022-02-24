package runner;
import org.junit.runner.RunWith;
import io.cucumber.java.*;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
            features = "./src/test/resources/Features/TestScript.feature",
            glue= "stepDefs"
    )

    public class TestRunner  {
       
        }



