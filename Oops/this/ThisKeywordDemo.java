class ThisKeyword
{
	public int x;
	public double y;
	public ThisKeyword(int x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public void print()
	{
		int x = 100;
		double y = 100.11;
		System.out.println("local x = "+x);
		System.out.println("local y = "+y);
		System.out.println("Non static x = "+this.x);
		System.out.println("Non static y= "+this.y);
		System.out.println();
	}
}
class ThisKeywordDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		ThisKeyword tk1 = new ThisKeyword(10,10.11);
		ThisKeyword tk2 = new ThisKeyword(20,20.11);
		ThisKeyword tk3 = new ThisKeyword(30,30.11);
		tk1.print();
		tk2.print();
		tk3.print();
		System.out.println("Main method ended");
	}
}
