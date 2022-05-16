class MyClass implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Thread Started: "+t.getName());
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("Thread Ended: "+t.getName());
    }
}
public class JoinMethod
{
    public static void main(String args[])
    {
        Thread th1 = new Thread(new MyClass(),"th1");
        Thread th2 = new Thread(new MyClass(),"th2");
        Thread th3 = new Thread(new MyClass(),"th3");
        th1.start();
        try
        {
            th1.join();
        }
        catch (Exception e)
        {
            System.out.println("Caught...");
        }
        th2.start();
        th3.start();
    }
}