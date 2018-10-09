package abstractfactorypattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if(choice == null)
			return null;
		if("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}else if("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}
}
