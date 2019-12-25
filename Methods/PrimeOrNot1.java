import java.util.Scanner;
class PrimeOrNot1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		int num = sc.nextInt();
		//String res = primeOrNot(num);
		//System.out.println(res);
		System.out.println(primeOrNot(num));
		System.out.println("Main method ended");
	}
	public static String primeOrNot(int num)
	{
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
			return ""+num+" is prime number";
		}
		else
		{
			return ""+num+" is not prime number";
		}
	}
}
