package hebbal.test;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
			{
				if((i==1)||(i==rows)||(j==1)||(j==rows)||(i==(rows/2)+1)||(j==(rows/2)+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
