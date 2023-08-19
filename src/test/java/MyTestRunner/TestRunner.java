package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
//Below Class use to add locations of feature and step Defination folder 
//Because TestRunner la mahit nahiye ya files kuth ahet
@CucumberOptions(
			features = "Features",
			glue = "StepDefination"	
		)


public class TestRunner {
	
}
