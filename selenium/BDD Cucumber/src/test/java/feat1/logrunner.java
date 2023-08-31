package feat1;

import javax.swing.text.html.HTML;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\log.feature", glue = {"feat1"},plugin = {"pretty","html:target\\Logreports\\HTMLreports"})
public class logrunner {
	
}
