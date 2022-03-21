import java.util.*;
class Box
{
	double h,l,b;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter Length ,Breadth ,Height : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
	}
	void volume()
	{
		double vol;
		vol=l*b*h;
		System.out.println("Volume of Box : "+vol);
	}
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box mybox=new Box();
		mybox.input();
		mybox.volume();
	}
}