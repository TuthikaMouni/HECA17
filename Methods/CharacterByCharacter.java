import java.util.Scanner;
class CharacterByCharacter 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		if(s != "")
		{
			for(int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("Main method ended");
	}
}
  