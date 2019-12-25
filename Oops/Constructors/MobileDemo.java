class Mobile
{
	String name;
	String colour;
	int price;
	Mobile(String arg1, String arg2, int arg3)
	{
		name = arg1;
		colour = arg2;
		price = arg3;
	}
}
class MobileDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Mobile m1 = new Mobile("Samsung","White",10000);
		Mobile m2 = new Mobile("Motorolla","Black",20000);
		Mobile m3 = new Mobile("Vivo","pink",15000);
		System.out.println("Name is "+m1.name);
		System.out.println("Colour is "+m1.colour);
		System.out.println("Price is "+m1.price);
		System.out.println();
		System.out.println("Name is "+m2.name);
		System.out.println("Colour is "+m2.colour);
		System.out.println("Price is "+m2.price);
		System.out.println();
		System.out.println("Name is "+m3.name);
		System.out.println("Colour is "+m3.colour);
		System.out.println("Price is "+m3.price);
		System.out.println("Main method ended");
	}
}
