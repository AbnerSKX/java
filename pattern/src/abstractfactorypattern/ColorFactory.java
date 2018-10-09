package abstractfactorypattern;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null)
			return null;
		if("RED".equalsIgnoreCase(color)) {
			return new Red();
		}else if("GREEN".equalsIgnoreCase(color)) {
			return new Green();
		}else if("BLUE".equalsIgnoreCase(color)) {
			return new Blue();
		}
		return null;
	}

}
