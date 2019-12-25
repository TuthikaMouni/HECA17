import java.util.Scanner;
class BigInThreeNumbers1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter third number : ");
		int num3 = sc.nextInt();
		System.out.println(bigInThreeNumbers(num1,num2,num3));
		System.out.println("Main method ended");
	}
	public static String bigInThreeNumbers(int num1, int num2, int num3)
	{
		if((num1>num2) && (num1>num3))
		{
			return ""+num1+" is bigger than "+num2+" and "+num3;
		}
		else if((num2>num1) && (num2>num3))
		{
			return ""+num2+" is bigger than "+num1+" and "+num3;
		}
		else
		{
			return ""+num3+" is bigger than "+num1+" and "+num2;
		}
	}
}
