package hebbal.singletonclass;

public class Test {
	private static Test t;
	private Test()
	{
		System.out.println("Inside Test constructor");
	}
	public static Test getObject()
	{
		if(t == null)
		{
			t = new Test();
		}
		return t;
	}
}
