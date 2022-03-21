//foreach
import java.util.*;
class ArrayDisplay
{
	public static void main(String args[])
	{
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element in array : ");
		for (int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Array : ");
		for (int i: ar)
		{
			System.out.println(i);
		}
	}
}