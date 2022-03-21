import java.util.*;
class Box
{
    double w,h,d;
}
class BoxWeight extends Box
{
    double weight;
    BoxWeight(double wi,double he,double de,double we)
    {
        w=wi;
        h=he;
        d=de;
        weight=we;
    }
    void volume()
    {
        double vol=w*h*d;
        System.out.println("Volume Of Box is : "+vol +" And Weight of The Box Is : "+weight);
    }
}
class Inherit
{
    public static void main(String args[]) 
    {
        double wid,hei,dep,wei;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Values Of Width ,Height, Depth, Weight Of Box Respectively : ");
        wid=sc.nextDouble();
        hei=sc.nextDouble();
        dep=sc.nextDouble();
        wei=sc.nextDouble();
        BoxWeight b=new BoxWeight(wid,hei,dep,wei);
        b.volume();
    }
}