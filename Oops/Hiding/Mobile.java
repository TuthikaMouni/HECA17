public class Mobile
{
	private String name;
	private double price;
	private String colour;
	public Mobile(String name, double price, String colour)
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
class MobileDemo 
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile("Samsung",10000.00,"Black");
		System.out.println("Mobile name : "+m1.getName());
		System.out.println("Mobile price : "+m1.getPrice());
		System.out.println("Mobile colour : "+m1.getColour());
		System.out.println();
		m1.setName("Oppo");
		m1.setPrice(15000.00);
		m1.setColour("White");
		System.out.println("Mobile name : "+m1.getName());
		System.out.println("Mobile price : "+m1.getPrice());
		System.out.println("Mobile colour : "+m1.getColour());
	}
}
