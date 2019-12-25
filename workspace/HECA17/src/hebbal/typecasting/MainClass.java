package hebbal.typecasting;

public class MainClass {
	public static void main(String[] args) {
		A a = new IClass();
		a.print();
		if(a instanceof IClass)
		{
			IClass i = (IClass)a;
			i.disp();
		}
	}
}
