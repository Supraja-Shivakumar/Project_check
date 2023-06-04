package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContext_setup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	public TestContext_setup testContext;

	public Hooks(TestContext_setup testContext) {
		this.testContext = testContext;
	}

	@After
	public void AfterScenario() throws IOException {
		testContext.testbase.WebdriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testContext.testbase.WebdriverManager();
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
