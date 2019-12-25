class Employee
{
	public String ename;
	public int eid;
	public double esal;
	public Employee(String ename, int eid, double esal)
	{
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
	}
	public void displayDetails()
	{
		System.out.println("Employee name is "+ename);
		System.out.println("Employee id is "+eid);
		System.out.println("Employee salary is "+esal);
	}
}
class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Mounika",404,30000.00);
		Employee e2 = new Employee("Satya",405,40000.00);
		Employee e3 = new Employee("Mamatha",406,50000.00);
		Employee e4 = new Employee("Sandy",407,60000.00);
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
	}
}
