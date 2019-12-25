import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int rem,sum=0;
		while(num != 0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println("The sum of the digits is "+sum);
		System.out.println("Main method ended");
	}
}
