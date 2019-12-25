package hebbal.interfaces;
import java.util.Scanner;
public class Artist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.Circle\n2.Square\n3.Rectangle\n4.Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: new ShapeFactory().getShape("circle").draw();
						break;
				case 2: new ShapeFactory().getShape("square").draw();
						break;
				case 3: new ShapeFactory().getShape("rectangle").draw();
						break;
				case 4: sc.close();
						System.exit(0);
			}
		}
	}
}
