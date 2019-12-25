class Sample
{
	public static void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void m3()
	{
		System.out.println("Inside m3 method");
	}
	public static void m4()
	{
		System.out.println("Inside m4 method");
	}
	public static void m5()
	{
		System.out.println("Inside m5 method");
	}
}
class Program3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Sample.m1();
		Sample.m2();
		Sample.m3();
		Sample.m4();
		Sample.m5();
		System.out.println("Main method ended");
	}
}
