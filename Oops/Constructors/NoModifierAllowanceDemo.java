class NoModifierAllowance
{
	static NoModifierAllowance() //Error bcz modifiers are not allowed for constructors
	{
		System.out.println("Inside NoModifierAllowance");
	}
}
class NoModifierAllowanceDemo 
{
	public static void main(String[] args) 
	{
		NoModifierAllowance m = new NoModifierAllowance();
		m.NoModifierAllowance();
	}
}
