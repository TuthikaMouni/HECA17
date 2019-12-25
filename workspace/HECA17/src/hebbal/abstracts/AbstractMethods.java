package hebbal.abstracts;

public class AbstractMethods {
	public static void main(String[] args) {
		C c = new C();
		System.out.println("X = "+c.x);
		System.out.println("Y = "+c.y);
		System.out.println("Z = "+c.z);
		c.print();
		c.print(10);
		c.disp();
	}
}
