import java.util.*;
interface IntStack
{
    void push(int item);
    int pop();
}
class FixedStack implements IntStack
{
    int stck[],top;
    FixedStack(int size)
    {
        stck=new int[size];
        top=-1;
    }
    public void push(int item)
    {
        if(top==stck.length-1)
        {
            System.out.println("Stack Is Full");
        }
        else
        {
            stck[++top]=item;
        }
    }
    public int pop()
    {
        if(top<0)
        {
            System.out.println("UnderFlow");
            return 0;
        }
        else
        {
            return stck[top--];
        }
    }
}
public class StackTest
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size1,size2;
        System.out.println("Enter Size Of The Stack1 : ");
        size1=sc.nextInt();
        System.out.println("Enter Size Of The Stack2 : ");
        size2=sc.nextInt();
        FixedStack s1=new FixedStack(size1);
        FixedStack s2=new FixedStack(size2);
        int a,b;
        System.out.println("Enter The Elements Of First Stack : ");
        for(int i=0;i<size1;i++)
        {
            a=sc.nextInt();
            s1.push(a);
        }
        System.out.println("Enter The Elements Of Second Stack : ");
        for(int i=0;i<size2;i++)
        {
            b=sc.nextInt();
            s2.push(b);
        }
        System.out.println("Elements Of First Stack Are : ");
        for(int i=0;i<size1;i++)
        {
            System.out.println(s1.pop());
        }
        System.out.println("Elements Of Second Stack Are : ");
        for(int i=0;i<size2;i++)
        {
            System.out.println(s2.pop());
        }
    }
}