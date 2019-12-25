class OddEven1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		int num = 34;
		System.out.println(isOddEven(num));
		System.out.println("Main method ended");
	}
	public static String isOddEven(int num)
	{
		if(num%2 == 0)
		{
			return ""+num+" is even";
		}
		else
		{
			return ""+num+" is odd";
		}
	}
}