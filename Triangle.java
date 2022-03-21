import java.util.*;
class Triangle
{
	Double base,height;
	Triangle(Double b,Double h)
	{
		base=b;
		height=h;
		Double area;
		area=0.5*b*h;
		System.out.println("Area of Triangle : "+area);
	}
	public static void main(String args[])
	{
		Double a,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base : ");
		a=sc.nextDouble();
		System.out.println("Enter Height : ");
		c=sc.nextDouble();
		Triangle t=new Triangle(a,c);
	}
}