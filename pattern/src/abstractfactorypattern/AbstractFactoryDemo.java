package abstractfactorypattern;

import org.junit.jupiter.api.Test;

public class AbstractFactoryDemo {

	@Test
	void testFactory()
	{
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//获取形状为Circle的对象
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		//获取形状为Rectangle的对象
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//获取形状为Square的对象
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//获取颜色为Red的对象
		Color red = colorFactory.getColor("RED");
		red.fill();
		//获取颜色为Green的对象
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		//获取颜色为Blue的对象
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
	}
}
