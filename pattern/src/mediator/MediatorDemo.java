package mediator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MediatorDemo {

	@Test
	void test() {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi!,John!");
		john.sendMessage("Hello!Robert!");
	}

}
