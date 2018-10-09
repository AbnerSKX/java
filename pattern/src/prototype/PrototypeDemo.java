package prototype;


import org.junit.jupiter.api.Test;

class PrototypeDemo {

	@Test
	void test() {
		ShapeCache.loadCache();
		
		Shape clonedCircle = ShapeCache.getShape("circle");
		System.out.println("Shape : " + clonedCircle.getType());
		
		Shape clonedsquare = ShapeCache.getShape("square");
		System.out.println("Shape : " + clonedsquare.getType());
		
		Shape clonedRectangle = ShapeCache.getShape("rectangle");
		System.out.println("Shape : " + clonedRectangle.getType());
	}

}
