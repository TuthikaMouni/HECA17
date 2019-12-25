class SumOfNumbers
{
	public void sum(int arg1, int arg2)
	{
		System.out.println("Sum of two integers is "+(arg1+arg2));
	}
	public void sum(double arg1, double arg2)
	{
		System.out.println("Sum of two Double numbers is "+(arg1+arg2));
	}
	public void sum(float arg1, float arg2)
	{
		System.out.println("Sum of two float numbers is "+(arg1+arg2));
	}
}
class SumOfNumbersDemo 
{
	public static void main(String[] args) 
	{
		SumOfNumbers s = new SumOfNumbers();
		s.sum(10,20);
		s.sum(10.11,20.11);
		s.sum(10.11f,20.11f);
	}
}
