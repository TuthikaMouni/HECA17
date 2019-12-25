import java.util.Scanner;
class ReverseString1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		System.out.println(reverseString(s));
		System.out.println("Main method ended");
	}
	public static String reverseString(String s)
	{
		String rev="";
		if(s != "")
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
		}
		return ""+"Reverse of a string is "+rev;
	}
}
