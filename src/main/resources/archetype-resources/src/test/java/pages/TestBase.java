#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import ${groupId}.util.Browser;
import ${groupId}.util.PropertyLoader;
import ${groupId}.webdriver.WebDriverFactory;

/**
 * Base class for all the test classes
 * 
 * @author qtran
 */
public class TestBase {

	protected static WebDriver webDriver;
	protected static String gridHubUrl;

	protected static String websiteUrl;

	protected static Browser browser;

	
	protected static void initCucumberTests() {
		websiteUrl = PropertyLoader.loadProperty("site.url");

		gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");

		webDriver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	protected static void tearDownCucumberTests() {
		if (webDriver != null) {
			webDriver.quit();
		}
	}
	
}
