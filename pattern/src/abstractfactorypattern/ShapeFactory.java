package abstractfactorypattern;



public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null)
			return null;
		if("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		}else if("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
