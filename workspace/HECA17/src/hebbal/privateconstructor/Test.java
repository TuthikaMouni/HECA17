package hebbal.privateconstructor;

public class Test {
	private Test()
	{
		System.out.println("Inside Test constructor");
	}
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static Test getObject()
	{
		return new Test();
	}
}
