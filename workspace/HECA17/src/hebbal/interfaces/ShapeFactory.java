package hebbal.interfaces;

public class ShapeFactory extends AbstractFactory {
	public Shape getShape(String s)
	{
		if(s.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		if(s.equalsIgnoreCase("square"))
		{
			return new Square();
		}
		else
		{
			return new Rectangle();
		}
	}

	public Color getColor(String s) {
		return null;
	}
}
