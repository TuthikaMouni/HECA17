class Test
{
	public void print(String msg)
	{
		System.out.println("I am "+msg);
	}
	public String disp()
	{
		return "Stupid";
	}
}
class Program1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.print("Stupid");
		System.out.println("I am "+t.disp());
	}
}
