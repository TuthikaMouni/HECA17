import java.util.Scanner;
class CharacterOccurance1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.print("Enter a character a search : ");
		char c = sc.next().charAt(0);
		System.out.println(characterOccurance(s,c));
		System.out.println("Main method ended");
	}
	public static String characterOccurance(String s, char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c == s.charAt(i))
			{
				count++;
			}
		}
		return "Number of occurance of "+c+" in given string is "+count;
	}
}