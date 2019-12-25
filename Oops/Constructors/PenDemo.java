class Pen
{
	public String name;
	public int price;
	Pen()
	{
	
	}
	Pen(String name)
	{
		this.name = name;
	}
	Pen(int price)
	{
		this.price = price;
	}
	Pen(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	Pen(int price,String name)
	{
		this.name = name;
		this.price = price;
	}
	public void displayPenDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Price is "+price);
		System.out.println();
	}
}
class PenDemo
{
	public static void main(String[] args) 
	{
		Pen p1 = new Pen();
		Pen p2 = new Pen("Cello Briter");
		Pen p3 = new Pen(15);
		Pen p4 = new Pen("Classic",10);
		Pen p5 = new Pen(20,"Cello Faster");
		p1.displayPenDetails();
		p2.displayPenDetails();
		p3.displayPenDetails();
		p4.displayPenDetails();
		p5.displayPenDetails();
	}
}
