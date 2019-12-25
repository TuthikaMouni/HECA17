class Student
{
	public String name = "Mounika";
	public int rollno = 404;
	public double marks = 81.04;
}
class StudentOperations
{
	public void m1(Student s)
	{
		System.out.println("Name is "+s.name);
		System.out.println("Roll number is "+s.rollno);
		System.out.println("Marks is "+s.marks);
		System.out.println();
		s.marks = 80.75;
	}
}
class ObjectAsAnArgument 
{
	public static void main(String[] args) 
	{
		StudentOperations so = new StudentOperations();
		Student s1 = new Student();
		so.m1(s1);
		System.out.println("Name is "+s1.name);
		System.out.println("Roll number is "+s1.rollno);
		System.out.println("Marks is "+s1.marks);
	}
}

