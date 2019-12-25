public class Car
{
	private String name;
	private double price;
	private String colour;
	public Car(String name, double price, String colour)
	{
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	//getters
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public String getColour()
	{
		return colour;
	}
	// setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setColour(String colour)
	{
		this.colour = colour;
	}
}
class CarDemo 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("Honda",300000.00,"Black");
		System.out.println("Mobile name : "+c1.getName());
		System.out.println("Mobile price : "+c1.getPrice());
		System.out.println("Mobile colour : "+c1.getColour());
		System.out.println();
		c1.setName("Innova");
		c1.setPrice(5000000.00);
		c1.setColour("White");
		System.out.println("Mobile name : "+c1.getName());
		System.out.println("Mobile price : "+c1.getPrice());
		System.out.println("Mobile colour : "+c1.getColour());
	}
}
