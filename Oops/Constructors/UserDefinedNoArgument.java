class B
{
	B()
	{
		System.out.println("Hello world");
	}
}
class UserDefinedNoArgument 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		new B();
		System.out.println("Main method ended");
	}
}
