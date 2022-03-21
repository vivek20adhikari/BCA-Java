import java.util.*;
class RecArea
{
	double length,breadth;
	RecArea(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void Area()
	{
		double ar=length*breadth;
		System.out.println("Area Of Rectangle : "+ar);
	}
}
class Rect
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Values : ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		RecArea r=new RecArea(l,b);
		r.Area();
	}
}
		
		
