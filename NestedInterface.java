interface Person
{
    void sleep();
    interface Activity
    {
        void move();
    }
}
public class NestedInterface implements Person.Activity
{
    public void move()
    {
        System.out.println("Person's Activity Is Moving");
    }
    public static void main(String[] args)
    {
        Person.Activity ob=new NestedInterface();
        ob.move();
    }
}