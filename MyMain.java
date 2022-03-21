import java.util.*;
class Add
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	Add()
	{
		System.out.println("Enter Two Numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		int c;
		c=a+b;
		System.out.println("The Sum Of Two Numbers is : "+c);
	}
}
class MyMain
{
	public static void main(String args[])
	{
		Add a=new Add();
	}
}