class Mythread extends Thread
{
    Mythread()
    {
        super("demo thread");
    }
    public void run()
    {
        System.out.println("Creating Thread using Thread class");
    }
}
public class ThreadClass
{
   public static void main(String args[])
    {
        Mythread m=new Mythread();
        m.start();
    }
}