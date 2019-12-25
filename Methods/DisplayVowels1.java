import java.util.Scanner;
class DisplayVowels1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Vowels in a given string are ");
		displayVowels(s);
		System.out.println("Main method ended");
	}
	public static void displayVowels(String s)
	{
		if(s != "")
		{
			for(int i=0;i<s.length();i++)
			{
				char res = s.charAt(i);
				if((res == 'A')||(res == 'E')||(res == 'I')||(res == 'O')||(res == 'U')||(res == 'a')||(res == 'e')||(res == 'i')||(res == 'o')||(res == 'u'))
				{
					System.out.println(res);
				}
			}
		}
	}
}
