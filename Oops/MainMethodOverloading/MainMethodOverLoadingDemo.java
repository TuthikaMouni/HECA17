class MainMethodOverLoading
{
	public static void main()
	{
		System.out.println("No-arg main method");
	}
	public static void main(int arg)
	{
		System.out.println("arg = "+arg);
	}
	public static void main(double arg)
	{
		System.out.println("arg = "+arg);
	}
	public static void main(String arg)
	{
		System.out.println("arg = "+arg);
	}
	public static void main(String arg1, String arg2)
	{
		System.out.println("arg1 = "+arg1+" arg2 = "+arg2);
	}
	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
class MainMethodOverLoadingDemo
{
	public static void main(String[] args) 
	{
		MainMethodOverLoading.main();
		MainMethodOverLoading.main(10);
		MainMethodOverLoading.main(10.11);
		MainMethodOverLoading.main("Hello");
		MainMethodOverLoading.main("Hi","Hello");
		String[] s = {"Hi","Hello","Guys"};
		MainMethodOverLoading.main(s);
	}
}
