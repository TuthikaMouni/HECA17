package hebbal.singletonclass;

public class TestMain {
	public static void main(String[] args) {
		Test t1 = Test.getObject();
		Test t2 = Test.getObject();
		System.out.println(t1 == t2);
	}
}
