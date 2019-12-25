class E
{
	int x;
	double y;
	E()
	{
		x = 0;
		y = 0.0;
	}
	E(int arg)
	{
		x = arg;
	}
	E(double arg)
	{
		y = arg;
	}
	E(int arg1, double arg2)
	{
		x = arg1;
		y = arg2;
	}
	E(double arg1, int arg2)
	{
		x = arg2;
		y = arg1;
	}
}
class ConstructorOverloading 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		E e1 = new E();
		System.out.println("X = "+e1.x);
		System.out.println("Y = "+e1.y);
		E e2 = new E(10);
		System.out.println("X = "+e2.x);
		System.out.println("Y = "+e2.y);
		E e3 = new E(10.11);
		System.out.println("X = "+e3.x);
		System.out.println("Y = "+e3.y);
		E e4 = new E(10,10.11);
		System.out.println("X = "+e4.x);
		System.out.println("Y = "+e4.y);
		E e5 = new E(10.11,10);
		System.out.println("X = "+e5.x);
		System.out.println("Y = "+e5.y);
		System.out.println("Main method ended");
	}
}
