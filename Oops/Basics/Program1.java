import java.util.Scanner;
class OddEven
{
	public static String oddEven(int num)
	{
		if(num%2 == 0)
		{
			return ""+num+" is even";
		}
		else
		{
			return ""+num+" is odd";
		}
	}
}
class PositiveNegative
{
	public static String positiveNegative(int num)
	{
		if(num>0)
		{
			return ""+num+" is positive";
		}
		else if(num<0)
		{
			return ""+num+" is negative";
		}
		else
		{
			return ""+num+" is zero";
		}
	}
}
class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num = sc.nextInt();
		System.out.println(OddEven.oddEven(num));
		System.out.println(PositiveNegative.positiveNegative(num));
		System.out.println("Main method ended");
	}
}
