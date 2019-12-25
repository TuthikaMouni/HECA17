class C 
{
	public static void main(String[] args) 
	{
		System.out.println(new X().a);
		new X().a = 100;
		System.out.println(new X().a);
	}
}
class X
{
	public int a = 10;
}
