class Program1 
{
	static int x;
	public static void main(String[] args) 
	{
		System.out.println("X = "+x);
		System.out.println("Hello World!");
		m1();
		m2();
	}
	public void m1()
	{
		System.out.println("Inside m1 method");
		//System.out.println("X = "+x);
	}
	public static void m2()
	{
		System.out.println("Inside me method");
	}
}
