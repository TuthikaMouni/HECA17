package hebbal.test;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int rows = sc.nextInt();
		int spaces = rows-1;
		int star = 1;
		for(int i=1; i<=rows; i++)
		{
			int num = spaces+1;
			for(int j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print(num++);
			}
			System.out.println();
			star++;
			spaces--;
		}
	}
}