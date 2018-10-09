package factorypattern;
 
import org.junit.jupiter.api.Test;

class ShapeFactoryDemo {

	@Test
	void testGetShape() {
		ShapeFactory shapeFactory = new ShapeFactory();
		//circle
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		//rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		//square
		Shape square = shapeFactory.getShape("square");
		square.draw();
	}

}
