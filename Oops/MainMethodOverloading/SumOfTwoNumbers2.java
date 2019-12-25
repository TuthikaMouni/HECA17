class Addition1
{
	public double addTwoNumbers(double a,double b)
	{
		return a+b;
	}
}
class SumOfTwoNumbers2
{
	public static void main(String[] args)
	{
		if(args.length == 2)
		{
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			System.out.println("Sum is "+new Addition1().addTwoNumbers(a,b));
		}
		else
		{
			System.out.println("Insufficient arguments");
		}
	}
}