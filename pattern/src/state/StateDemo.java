package state;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StateDemo {

	@Test
	void test() {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
	}

}
