package hebbal.test;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tha number : ");
		int num = sc.nextInt();
		int a = 0, b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		do
		{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		while(num>=c);
	}
}
