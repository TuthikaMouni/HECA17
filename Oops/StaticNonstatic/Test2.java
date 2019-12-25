class A
{
	public int x = 10;
	public void print()
	{
		System.out.println("Hello");
	}
}
class Test2 
{
	public static void main(String[] args) 
	{
		System.out.println(new A().x);
		new A().print();
	}
}