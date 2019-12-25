class C
{
	int x = 10;
	double y = 10.11;
	{
		x = 100;
		y = 100.11;
	}
	C()
	{
		x = 1000;
		y = 1000.11;
	}
}
class InstanceBlockConstructor 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		C c = new C();
		System.out.println("X = "+c.x);
		System.out.println("Y = "+c.y);
		System.out.println("Main method ended");
	}
}
