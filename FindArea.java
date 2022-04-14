import java.util.*;
class Figure
{
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    double area()
    {
        System.out.println("Successful Area Calculation.");
        return 0;
    }
}
class Rectangle extends Figure
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside Area For Rectangle.");
        return dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside Area For Triangle.");
        return dim1*dim2/2 ;
    }
}
public class FindArea
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Dimensions : ");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        Figure f=new Figure(c, d);
        Rectangle r=new Rectangle(c, d);
        Triangle t=new Triangle(c, d);
        Figure fig;
        fig = f;
        System.out.println("Figure Area : " + fig.area());
        fig = r;
        System.out.println("Rectangle Area : " + fig.area());
        fig = t;
        System.out.println("Triangle Area : " + fig.area());
    }
}