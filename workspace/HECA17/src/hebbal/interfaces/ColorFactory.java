package hebbal.interfaces;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String s)
	{

		if(s.equalsIgnoreCase("red"))
		{
			return new Red();
		}
		else if(s.equalsIgnoreCase("green"))
		{
			return new Green();
		}
		else
		{
			return new Blue();
		}
	}
	public Shape getShape(String s) {
		return null;
	}
}
