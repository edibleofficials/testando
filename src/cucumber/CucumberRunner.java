package cucumber;

/*
  CucumberRunner class
    - Helps feature files to understand that they need to run as a part of a JUnit test
    - It works as a bridge feature files with step definition files
 */

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		//define the output used in reports
		format = {"pretty", "json:target/"}, 
     	//define where to search for .feature files
		features = {"src/cucumber/"} 
		)
public class CucumberRunner {

}
