package hebbal.singletonclass;

public class TestMain1 {
	public static void main(String[] args) {
		Test1 t1 = Test1.getObject();
		Test1 t2 = Test1.getObject();
		System.out.println(t1 == t2);
	}
}
