class BigInThreeNumbers1
{
	public static void main(String[] args) 
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.print(args[i]);
			if((args[0]>args[1]) && (args[0]>args[2]))
			{
				System.out.println(args[0]+" is bigger than "+args[1]+" and "+args[2]);
			}
			else if((args[1]>args[0]) && (args[1]>args[2]))
			{
				System.out.println(args[1]+" is bigger than "+args[0]+" and "+args[2]);
			}
			else
			{
				System.out.println(args[2]+" is bigger than "+args[0]+" and "+args[1]);
			}
		}
	}
}
