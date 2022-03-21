import java.util.Scanner;
class Operation
{
	public static void main(String args[])
	{
		double res1,res2,res3,res4,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		res1=a+b;
		System.out.println("Added value is : " +res1);
		res2=a-b;
		System.out.println("Subtracted value is : " +res2);
		res3=a*b;
		System.out.println("Multiplied value is : " +res3);
		res4=a/b;
		System.out.println("Divided value is : " +res4);
	}
}	