import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		String rev="";
		if(s != "")
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			System.out.println("Reverse of a string is "+rev);
		}
		System.out.println("Main method ended");
	}
}
