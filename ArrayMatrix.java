import java.util.*;
class ArrayMatrix
{
	public static void main(String args[])
	{
		int ar[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements of Array : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix Array : ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}
		