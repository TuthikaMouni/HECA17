import java.util.Scanner;
class SearchCharacter1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.print("Enter a character to search : ");
		char c = sc.next().charAt(0);
		System.out.println(searchCharacter(s,c));
		System.out.println("Main method ended");
	}
	public static String searchCharacter(String s, char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c == s.charAt(i))
			{
				count = 1;
			}
		}
		if(count == 1)
		{
			return ""+c+" is found in given string";
		}
		else
		{
			return ""+c+" is not found in given string";
		}
	}
}
