import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		int m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks : ");
		m=sc.nextInt();
		if( m<40)
			System.out.println("Grade is F ");
		else if (m>=40 && m<=60)
			System.out.println("Grade is E ");
		else if (m>=61 && m<=75)
			System.out.println("Grade is D ");
		else if (m>=76 && m<=85)
			System.out.println("Grade is C ");
		else if (m>=86 && m<=95)
			System.out.println("Grade is B ");
		else 
			System.out.println("Grade is A ");
	}
}