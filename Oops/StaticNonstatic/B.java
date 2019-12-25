class B 
{
	public static void main(String[] args) 
	{
		X x = new X();
		System.out.println(x.a);
		x.a = 100;
		System.out.println(x.a);
	}
}
class X
{
	public int a = 10;
}
