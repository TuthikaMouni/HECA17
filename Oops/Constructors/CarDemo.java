class Car
{
	public String name;
	public String colour;
	public double price;
	Car()
	{
		name = null;
		colour = null;
		price = 0.0;
	}
	Car(String name, String colour, double price)
	{
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	Car(String name,String colour)
	{
		this.name = name;
		this.colour = colour;
	}
	Car(String name,double price)
	{
		this.name = name;
		this.price = price;
	}
	/*Car(String colour,String name)-->Error bcz constructor already defined, here order of datatype is same.
	{
		this.colour = colour;
		this.name = name;
	}*/
	Car(String colour,double price,String name)
	{
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	public void displayCarDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Colour is "+colour);
		System.out.println("Price is "+price);
	}
}
class CarDemo
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		Car c2 = new Car("Audi","White",2500000.00);
		Car c3 = new Car("BMW","Blue");
		Car c4 = new Car("Honda",150000.00);
		Car c5 = new Car("Red","Ford");
		Car c6 = new Car("Red",1200000.00,"Ford");
		c1.displayCarDetails();
		System.out.println();
		c2.displayCarDetails();
		System.out.println();
		c3.displayCarDetails();
		System.out.println();
		c4.displayCarDetails();
		System.out.println();
		c5.displayCarDetails();
		System.out.println();
		c6.displayCarDetails();

	}
}
