#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ${groupId}.Superman;

public class Stepdefs {

	Superman superman = new Superman();
	
	@Given("^Superman met (.*) in the park$")
	public void Superman_met_in_the_park(String enemy) throws Throwable {
		superman.catchEnemy(enemy);
	}
	
	@When("^At (\\d+) pm$")
	public void At_pm(int hour) {
		superman.say(hour);
	}
	
	@Then("^Superman flied upon (.*) and attacked him$")
	public void Superman_flied_upon_and_attacked_him(String enemy) {
		superman.defeatEnemy(enemy);
	}
}
