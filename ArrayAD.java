import java.util.*;
class ArrayAD
{
	public static void main(String args[])
	{
		int ar[]=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements of Array : ");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order : ");
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Descending Order : ");
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	
	}
}