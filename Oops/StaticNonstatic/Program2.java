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
class Program2 
{
	public static void main(String[] args) 
	{
		new Test().print("Stupid");
		System.out.println("I am "+new Test().disp());
	}
}
