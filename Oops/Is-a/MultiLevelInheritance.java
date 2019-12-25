class A
{
	public int x=10;
	public void print()
	{
		System.out.println("Inside A class");
		System.out.println("X = "+x);
	}
}
class B extends A
{
	public double y=10.11;
	public void print(int a)
	{
		System.out.println("Inside B class");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
}
class C extends B
{
	public char z='A';
	public void print(int a,int b)
	{
		System.out.println("Inside C class");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
	}
}
class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println("X = "+c.x);
		System.out.println("Y = "+c.y);
		System.out.println("Z = "+c.z);
		c.print();
		c.print(10);
		c.print(10,20);

		B b = new B();
		System.out.println("X = "+b.x);
		System.out.println("Y = "+b.y);
		b.print();
		b.print(10);

		A a = new A();
		System.out.println("X = "+a.x);
		a.print();
	}
}
