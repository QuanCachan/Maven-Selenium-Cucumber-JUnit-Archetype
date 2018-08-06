#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.cucumber;

public class Superman {

	public void catchEnemy(String enemy) {
		System.out.println("Aha! I got you...");
	}

	public void say(int string) {
		System.out.println("And it is "+string+" pm.");
		
	}

	public void defeatEnemy(String string) {
		System.out.println(string+" ...You are over!");
		
	}
}
