import java.util.Scanner;
class DisplayVowels 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		char res;
		if(s != "")
		{
			System.out.println("Vowels in a given string are ");
			for(int i=0;i<s.length();i++)
			{
				res = s.charAt(i);
				if((res == 'A')||(res == 'E')||(res == 'I')||(res == 'O')||(res == 'U')||(res == 'a')||(res == 'e')||(res == 'i')||(res == 'o')||(res == 'u'))
				{
					System.out.println(res);
				}
			}
		}
		System.out.println("Main method ended");
	}
}
