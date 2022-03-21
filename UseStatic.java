import java.util.*;
class UseStatic
{
	static
	{
		System.out.println("Static Block Will Execute First");
	}
	static int rollno;
	static String name;
	static String college="IINTM";
	UseStatic(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String args[])
	{
		int roll;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter RollNo : ");
		roll=sc.nextInt();
		UseStatic s1=new UseStatic(roll,name);
		display();
	}
}
		
	