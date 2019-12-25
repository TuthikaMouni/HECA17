import java.util.Scanner;
class PalindromeOrNot1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(palindromeOrNot(num));
		System.out.println("Main method ended");
	}
	public static String palindromeOrNot(int num)
	{
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
			return ""+temp+" is palindrome";
		}
		else
		{
			return ""+temp+" is not palindrome";
		}
	}
}
