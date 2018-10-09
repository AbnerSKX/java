package prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String,Shape> shapeMap = 
			new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		return (Shape) cacheShape.clone();
	}
	
	//��ÿ����״���������ݿ��ѯ������������״
	//shapeMap.put(shapeKey,shape);
	//���磬����Ҫ����������״
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("circle");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("square");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("rectangle");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}