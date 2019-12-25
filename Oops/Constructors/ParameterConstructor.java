class D
{
	int x;
	double y;
	D(int arg1, double arg2)
	{
		x = arg1;
		y = arg2;
	}
}
class ParameterConstructor 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		D d1 = new D(10,10.11);
		System.out.println("X = "+d1.x);
		System.out.println("Y = "+d1.y);
		D d2 = new D(20,20.11);
		System.out.println("X = "+d2.x);
		System.out.println("Y = "+d2.y);
		D d3 = new D(30,30.11);
		System.out.println("X = "+d3.x);
		System.out.println("Y = "+d3.y);
		System.out.println("Main method ended");
	}
}
