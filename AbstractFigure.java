import java.util.*;
abstract class Figure
{
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract double area();
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

class AbstractFigure
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Dimensions : ");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        Rectangle r=new Rectangle(c, d);
        Triangle t=new Triangle(c, d);
        Figure fig;
        fig = r;
        System.out.println("Rectangle Area : " + fig.area());
        fig = t;
        System.out.println("Triangle Area : " + fig.area());
    }
}