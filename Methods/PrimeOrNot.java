import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num = sc.nextInt();
		int factors = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num%i == 0)
			{
				factors++;
			}
		}
		if(factors == 2)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
		System.out.println("Main method ended");
	}
}
