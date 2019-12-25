import java.util.Scanner;
class CharacterByCharacter1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		characterByCharacter(s);
		System.out.println("Main method ended");
	}
	public static void characterByCharacter(String s)
	{
		if(s != "")
		{
			for(int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
  