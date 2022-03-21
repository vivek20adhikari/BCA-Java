import java.util.*;
abstract class Office 
{
    int empno;
    double empsalary;
    String empname;
    abstract void getValue();
}
class Teaching extends Office
{
    String designation;
    void setValue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        empname=sc.next();
        System.out.println("Enter Employee No. : ");
        empno=sc.nextInt();   
        System.out.println("Enter Employee Salary : ");
        empsalary=sc.nextDouble();
        System.out.println("Enter designation : ");
        designation=sc.next();
    }
    void getValue()
    {
        System.out.println("Employee Name : "+empname);
        System.out.println("Employee No : "+empno);
        System.out.println("Employee Salary : "+empsalary);
        System.out.println("Employee Designation : "+designation);
    }
}

class NonTeaching extends Office
{
    String designation;
    void setValue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        empname=sc.next();
        System.out.println("Enter Employee No. : ");
        empno=sc.nextInt();
        System.out.println("Enter Employee Salary : ");
        empsalary=sc.nextDouble();
        System.out.println("Enter designation : ");
        designation=sc.next();
    }
    void getValue()
    {
        System.out.println("Employee Name : "+empname);
        System.out.println("Employee No : "+empno);
        System.out.println("Employee Salary : "+empsalary);
        System.out.println("Employee Designation : "+designation);
    }
}
class OfficeDemo
{
    public static void main(String args[]) 
    {
        Teaching t=new Teaching();
        t.setValue();
        t.getValue();
        NonTeaching nt=new NonTeaching();
        nt.setValue();
        nt.getValue();
    }
}