class ArrayMainMethodOverLoading
{
	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(int[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(double[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
	public static void main(char[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
class ArrayMainMethodOverLoadingDemo
{
	public static void main(String[] args) 
	{
		String[] s = {"Hi","Hello","Guys","Bye"};
		int[] i = {10,20,30,40,50};
		double[] d = {10.11,20.11,30.11,40.11};
		char[] c = {'A','B','C','D','E'};
		ArrayMainMethodOverLoading.main(s);
		ArrayMainMethodOverLoading.main(i);
		ArrayMainMethodOverLoading.main(d);
		ArrayMainMethodOverLoading.main(c);
	}
}
