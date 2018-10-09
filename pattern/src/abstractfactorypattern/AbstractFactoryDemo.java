package abstractfactorypattern;

import org.junit.jupiter.api.Test;

public class AbstractFactoryDemo {

	@Test
	void testFactory()
	{
		//��ȡ��״����
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//��ȡ��״ΪCircle�Ķ���
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		//��ȡ��״ΪRectangle�Ķ���
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//��ȡ��״ΪSquare�Ķ���
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		//��ȡ��ɫ����
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//��ȡ��ɫΪRed�Ķ���
		Color red = colorFactory.getColor("RED");
		red.fill();
		//��ȡ��ɫΪGreen�Ķ���
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		//��ȡ��ɫΪBlue�Ķ���
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
	}
}
