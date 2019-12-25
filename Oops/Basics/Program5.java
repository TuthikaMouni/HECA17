import java.util.Scanner;
class FindChar
{
	public static void findCharInString(String s, char c)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == c)
			{
				System.out.println("Character "+c+" is found in "+i+" position");
				return;
			}
		}
		System.out.println("Character "+c+" not found");
	}
}
class Program5
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		System.out.print("Enter Character : ");
		char c = sc.next().charAt(0);
		FindChar.findCharInString(s,c);
	}
}
