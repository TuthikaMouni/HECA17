class Addition
{
	public int addTwoNumbers(int a,int b)
	{
		return a+b;
	}
}
class SumOfTwoNumbers1
{
	public static void main(String[] args)
	{
		if(args.length == 2)
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Sum is "+new Addition().addTwoNumbers(a,b));
		}
		else
		{
			System.out.println("Insufficient arguments");
		}
	}
}