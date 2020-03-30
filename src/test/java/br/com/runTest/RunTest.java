package br.com.runTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import br.com.application.name.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * @author Ronaldo Silva
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"json:target/cucumber.json" }, features = { ".//src//test//resources//" }, glue = {
				"br.com.appName.steps.web","br.com.application.name.configuration" },

//Limpar RunTest antes de subir

        tags = {"@web"})


public class RunTest extends BaseTest {
	@AfterClass
	public static void AfterTests() {
		if (webDriver != null)
			closeWeb();
		if (driver != null)
			closeMobileAfter();
	}
}