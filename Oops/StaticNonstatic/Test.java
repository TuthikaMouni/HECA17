class A
{
	public int x = 10;
	public void print()
	{
		System.out.println("Hello");
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a = null;
		System.out.println(a.x);
		a.print();
	}
}
