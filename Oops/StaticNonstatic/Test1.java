class A
{
	public int x = 10;
	public void print()
	{
		System.out.println("Hello");
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.x);
		a.print();
	}
}