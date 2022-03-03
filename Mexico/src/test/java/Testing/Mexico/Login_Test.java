package Testing.Mexico;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features ="C:\\Users\\SDEEPAKY\\git\\demo\\Mexico\\src\\main\\java\\features\\login.feature" 
, glue ="step_def" ,monochrome = true , plugin = {"pretty","html:target/cucumber-pretty","junit:target/report.xml","json:target/jsonreport.json"})
public class Login_Test {
	
	
	
	

}
