package bridge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BridgeDemo {

	@Test
	void test() {
		Shape redCircle = new Circle(100,100,10,new RedCircle());
		Shape greenCircle = new Circle(100,100,10,new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
