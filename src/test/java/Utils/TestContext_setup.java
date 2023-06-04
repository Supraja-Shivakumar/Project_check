package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContext_setup {
	public WebDriver driver;
	public String LandingpageProdName;
	public pageObjectManager pageObjectmanager;
	public TestBase testbase; 
	public GenaricUtils genaricUtils;

	
	public TestContext_setup() throws IOException {
		testbase=new TestBase();
		pageObjectmanager=new pageObjectManager(testbase.WebdriverManager());
		genaricUtils=new GenaricUtils(testbase.WebdriverManager());
		
		
	}
}
