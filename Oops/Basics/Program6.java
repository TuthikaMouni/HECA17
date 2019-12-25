class A
{
	public static void print()
	{
		System.out.println("In A class print method");
		B.view();
	}
}
class C
{
	public static void disp()
	{
		System.out.println("In C class disp method");
		Test.myMethod();
	}
}
class Demo
{
	public static void yourMethod()
	{
		System.out.println("In Demo class yourMethod");
		B.someMethod();
	}
}
class B
{
	public static void view()
	{
		System.out.println("In B class view method");
	}
	public static void someMethod()
	{
		System.out.println("In B class someMethod");
	}
}
class Test
{
	public static void myMethod()
	{
		System.out.println("In Test class myMethod method");
	}
}
class Program6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		A.print();
		C.disp();
		Demo.yourMethod();
		System.out.println("Main method ended");
	}
}
