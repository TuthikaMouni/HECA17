import java.util.Scanner;
class NextCharacter 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		if(s != "")
		{
			System.out.println("Next character string is ");
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				c++;
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("Main method ended");
	}
}
