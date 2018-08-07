#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 * 
 * @author qtran
 */
public class HomePage extends Page {

	private static final String INPUT_FIELD = "lst-ib";
	
	private static final String SEARCH_BUTTON = "btnK";
	
	@FindBy(how = How.ID, using = INPUT_FIELD)
	@CacheLookup
	private WebElement inputField;
	
	@FindBy(how = How.ID_OR_NAME, using = SEARCH_BUTTON)
	@CacheLookup
	private WebElement searchButton;
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public WebElement getInputField() {
		return inputField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}


	//You can define other elements of your Website below...

}
