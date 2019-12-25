import java.util.Scanner;
class Calculator 
{
	public static int addTwoNum(int x, int y)
	{
		return x+y;
	}
	public static int subTwoNum(int x, int y)
	{
		return x-y;
	}
	public static int mulTwoNum(int x, int y)
	{
		return x*y;
	}
	public static int divTwoNum(int x, int y)
	{
		return x/y;
	}
	public static int modTwoNum(int x, int y)
	{
		return x%y;
	}
}
class Program7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x value : ");
		int x = sc.nextInt();
		System.out.print("Enter y value : ");
		int y = sc.nextInt();
		System.out.println("Main method started");
		System.out.println("Addition of two numbers is "+Calculator.addTwoNum(x,y));
		System.out.println("Subtraction of two numbers is "+Calculator.subTwoNum(x,y));
		System.out.println("Multiplication of two numbers is "+Calculator.mulTwoNum(x,y));
		System.out.println("Division of two numbers is "+Calculator.divTwoNum(x,y));
		System.out.println("Modulo of two numbers is "+Calculator.modTwoNum(x,y));
		System.out.println("Main method ended");
	}
}
