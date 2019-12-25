class Mobile1
{
	public String name;
	public String colour;
	public int price;
	Mobile1(String name, String colour, int price)
	{
		this.name = name;
		this.colour = colour;
		this.price = price;
	}
	public void displayMobileDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Colour is "+colour);
		System.out.println("Price is "+price);
	}
}
class MobileDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Mobile1 m1 = new Mobile1("Samsung","White",10000);
		Mobile1 m2 = new Mobile1("Motorolla","Black",20000);
		Mobile1 m3 = new Mobile1("Vivo","pink",15000);
		m1.displayMobileDetails();
		System.out.println();
		m2.displayMobileDetails();
		System.out.println();
		m3.displayMobileDetails();
		System.out.println("Main method ended");
	}
}
