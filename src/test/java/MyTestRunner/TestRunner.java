package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
//Below Class use to add locations of feature and step Defination folder 
//Because TestRunner la mahit nahiye ya files kuth ahet
@CucumberOptions(
			features = "Features", 		//Directory of features file
			glue = "StepDefination",	    //Directory or package name where the stepdefinition is present
			//dryRun = true 				//ByDefault dryRun value is true and use to check the mapping is proper between feature and step def. file
			plugin={"pretty","html:Output/report.html","json:Output/report.json","junit:Output/report.xml"},	//There are three reports we can get HTML,XML and JSON
			monochrome = true				//Shows report properly..ie. which case/scenario is passed and failed
		)


public class TestRunner {
	
}
