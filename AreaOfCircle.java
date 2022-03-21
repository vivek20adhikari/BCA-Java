import java.util.*;
class AreaOfCircle
{
	public static void main(String args[])
	{
		int radius;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle :");
		radius = sc.nextInt();
		area = radius * 3.14f;
		System.out.print("Area of Circle : " + area);
	}
}
