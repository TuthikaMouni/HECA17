class PositiveNegative1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		int num = 43;
		System.out.println(positiveNegative(num));
		System.out.println("Main method ended");
	}
	public static String positiveNegative(int num)
	{
		if(num>0)
		{
			return ""+num+" is positive";
		}
		else if(num<0)
		{
			return ""+num+" is negative";
		}
		else
		{
			return ""+num+" is neither positive nor negative";
		}
	}
}