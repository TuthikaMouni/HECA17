package hebbal.privateconstructor;

public class TestMain {
	public static void main(String[] args) {
		Test t1 = Test.getObject();
		t1.m1();
		Test t2 = Test.getObject();
		t2.m1();
	}
}
