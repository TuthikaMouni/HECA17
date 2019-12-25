package hebbal.interfaces;
import java.util.Scanner;
public class Forest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("1.Dog\n2.Cat\n3.Lion\n4.Exit");
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1: new AnimalFactory().getAnimal("dog").sound();
						break;
				case 2: new AnimalFactory().getAnimal("cat").sound();
						break;
				case 3: new AnimalFactory().getAnimal("lion").sound();
						break;
				case 4: sc.close();
						System.exit(0);
			}
		}
	}
}
