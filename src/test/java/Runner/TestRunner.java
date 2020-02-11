package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature_file\\demo1.feature",glue= {"Stepdef"},plugin= {"html:target\\report.html"},monochrome= true)

public class TestRunner {

}
