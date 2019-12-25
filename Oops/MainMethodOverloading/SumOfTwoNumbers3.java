class Addition2
{
	public int addTwoNumbers(int a,int b)
	{
		return a+b;
	}
	public static int convertToInt(String s)
	{
		int num = 0;
		for(int i=0; i<s.length(); i++)
		{
			num = num*10+s.charAt(i)-48;
		}
		return num;
	}
}
class SumOfTwoNumbers3
{
	public static void main(String[] args)
	{
		if(args.length == 2)
		{
			int a = Addition2.convertToInt(args[0]);
			int b = Addition2.convertToInt(args[1]);
			System.out.println("Sum is "+new Addition2().addTwoNumbers(a,b));
		}
		else
		{
			System.out.println("Insufficient arguments");
		}
	}
}