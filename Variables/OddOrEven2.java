class OddOrEven2
{
	public static void main(String[] args) 
	{
		int n = 5;
		if((n & 1) == 0)//or if(n%2 == 1)//odd 
		{
			System.out.println(n+" id even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
	}
}
