class PositiveNegative 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		int num = 43;
		int res = positiveNegative(num);
		if(res == 1)
		{
			System.out.println(num+" is positive");
		}
		else if(res == -1)
		{
			System.out.println(num+" is negative");
		}
		else
		{
			System.out.println(num+" is neither positive nor negative");
		}
		System.out.println("Main method ended");
	}
	public static int positiveNegative(int num)
	{
		if(num>0)
		{
			return 1;
		}
		else if(num<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
