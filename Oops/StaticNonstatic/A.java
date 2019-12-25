class Student
{
	public String getName()
	{
		return "Dinga";
	}
	public double getMarks()
	{
		return 81.12;
	}
	public int getId()
	{
		return 420;
	}
}
class A
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		System.out.println("I am "+s.getName()+" having "+s.getId()+" as Id & secured "+s.getMarks()+" marks");
		System.out.println("I am "+new Student().getName()+" having "+new Student().getId()+" as Id & secured "+new Student().getMarks()+" marks");
	}
}
