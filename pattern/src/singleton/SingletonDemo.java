package singleton;

import org.junit.jupiter.api.Test;

public class SingletonDemo {

	@Test
	void testShowMessage() {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		System.out.println("1:" + object);
		 
		
		
	}
	
	
}
