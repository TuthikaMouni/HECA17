class OddEven 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		int num = 34;
		System.out.println(num+" is "+isOddEven(num));
		/*boolean b = isOddEven(num);
		if(b == true)
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num+" is odd");
		}*/
		System.out.println("Main method ended");
	}
	public static boolean isOddEven(int num)
	{
		if(num%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
