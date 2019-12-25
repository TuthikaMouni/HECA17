import java.util.Scanner;
class NextCharacter1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Next character string is ");
		nextCharacter(s);
		System.out.println("Main method ended");
	}
	public static void nextCharacter(String s)
	{
		if(s != "")
		{
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				c++;
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
