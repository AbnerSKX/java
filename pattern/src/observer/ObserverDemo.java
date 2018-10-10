package observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObserverDemo {

	@Test
	void test() {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	      
	      System.out.println("First state change: 15");   
	      subject.setState(15);
	      System.out.println("Second state change: 10");  
	      subject.setState(10);
	}

}
