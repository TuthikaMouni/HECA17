package hebbal.test;
public class PrimeRange {
	public static void main(String[] args) {
		for(int i=300; i<=600; i++)
		{
			int factors = 0;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					factors++;
				}
			}
			if(factors == 2)
			{
				System.out.println(i);
			}
		}
	}
}
