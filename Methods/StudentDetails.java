import java.util.Scanner;
class StudentDetails 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name :");
		String sname = sc.next();
		System.out.print("Enter college name :");
		sc.nextLine();
		String cname = sc.nextLine();
		System.out.print("Enter student id :");
		int sid = sc.nextInt();
		System.out.print("Enter student marks :");
		double smarks = sc.nextDouble();
		System.out.print("Enter student grade :");
		char sgrade = sc.next().charAt(0);
		System.out.print("Enter student mobile no :");
		long smobile = sc.nextLong();
		System.out.println("Student details are....");
		System.out.println("Student name is "+sname);
		System.out.println("College name is "+cname);
		System.out.println("Student id is "+sid);
		System.out.println("Student marks is "+smarks);
		System.out.println("Student grade is "+sgrade);
		System.out.println("Student mobile number is "+smobile);
		System.out.println("Main method ended");
	}
}
