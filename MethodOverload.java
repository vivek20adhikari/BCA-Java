import java.util.*;
class Area
{
	void area1(double r)
	{
		double ar=3.14*r*r;
		System.out.println("Area Of Circle : "+ar);
	}
	void area1(double l,double b)
	{
		double x=l*b;
		System.out.println("Area Of Rectangle : "+x);
	}
}
class MethodOverload
{
	public static void main(String args[])
	{
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius Of Circle: ");
		double radius=sc.nextDouble();
		a.area1(radius);
		System.out.println("Enter Length and Breadth Of Rectangle : ");
		double len=sc.nextDouble();
		double bre=sc.nextDouble();
		a.area1(len,bre);
	}
}
		
		
		
