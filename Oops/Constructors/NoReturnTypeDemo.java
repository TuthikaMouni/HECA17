class NoReturnType
{
	void NoReturnType()
	{
		System.out.println("Inside NoReturnType");
	}
}
class NoReturnTypeDemo 
{
	public static void main(String[] args) 
	{
		NoReturnType n = new NoReturnType();
		n.NoReturnType();
	}
}
