class Test
{
	public static int x = 20;
	public static final long l = 3454775l;
	public static void m1()
	{
		System.out.println("Inside main method");
	}
}
class AccessStaticMembers 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		System.out.println("X = "+Test.x);
		System.out.println("L = "+Test.l);
		Test.m1();
		//Reassignment
		Test.x = 50;
		//Test.l = 367475l; --->Error because we declared l as final
		System.out.println("X = "+Test.x);
		System.out.println("L = "+Test.l);
		System.out.println("Main method ended");
	}
}
