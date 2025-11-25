import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features", glue = {"stepdefenition"},plugin = {"pretty", "html:testReports/cucumber-reports.html"},monochrome = true)
public class testrunner extends AbstractTestNGCucumberTests{

}
