import java.util.*;
class Test
{
	int a,b;
	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	void method(Test t)
	{
		t.a*=2;
		t.b/=2;
	}
}

class CallByReference
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Values : ");
		a=sc.nextInt();
		b=sc.nextInt();
		Test obj=new Test(a,b);
		System.out.println("obj.a and obj.b BEFORE call are : "+obj.a+" "+obj.b);
		obj.method(obj);
		System.out.println("obj.a and obj.b AFTER call are : "+obj.a+" "+obj.b);
	}
}

		