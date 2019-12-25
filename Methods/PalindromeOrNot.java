import java.util.Scanner;
class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int rem,rev=0;
		int temp = num;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		if(temp == rev)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not palindrome");
		}
		System.out.println("Main method ended");
	}
}
