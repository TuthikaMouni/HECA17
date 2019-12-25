package hebbal.singletonclass;

public class Test1 {
	private static Test1 t;
	private Test1()
	{
		System.out.println("Inside Test constructor");
	}
	public static Test1 getObject()
	{
		return t;
	}
	static
	{
		t = new Test1();
	}
}
