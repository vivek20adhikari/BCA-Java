import java.util.*;
class AgeException extends Exception
{
    AgeException(String str)
    {
        System.out.println(str);
    }  
}
class AgeExcDemo
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Age : ");   
        int age=s.nextInt();
        try 
        {
            if(age<18)
                throw new AgeException("Invalid Age Cant't Vote");
            else
                System.out.println("Valid Age You Can Vote");
        } 
        catch (AgeException e) 
        {
            System.out.println("Caugth : "+e);
        }
    }
}