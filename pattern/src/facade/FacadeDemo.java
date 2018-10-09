package facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacadeDemo {

	@Test
	void test() {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
