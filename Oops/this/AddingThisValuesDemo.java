class AddingThisValues
{
	int x;
	double y;
	AddingThisValues(int x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public void sum()
	{
		int x = 100;
		double y = 200.0;
		this.x = this.x+x;
		this.y = this.y+y;
	}
	public void disp()
	{
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
}
class AddingThisValuesDemo 
{
	public static void main(String[] args) 
	{
		AddingThisValues a = new AddingThisValues(10,20.0);
		System.out.println("Before calling sum");
		a.disp();
		System.out.println("After calling sum");
		a.sum();
		a.disp();
	}
}
