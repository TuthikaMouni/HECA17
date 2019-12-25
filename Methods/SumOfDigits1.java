import java.util.Scanner;
class SumOfDigits1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The sum of the digits is "+sumOfDigits(num));
		System.out.println("Main method ended");
	}
	public static int sumOfDigits(int num)
	{
		int rem,sum=0;
		while(num != 0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		return sum;
	}
}