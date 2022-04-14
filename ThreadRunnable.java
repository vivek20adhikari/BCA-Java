class Mythread implements Runnable
{
  public void run()
  {
    System.out.println("Creating Thread using Thread Runnable Interface");
  }
}
public class ThreadRunnable
{ 
  public static void main(String args[])
  {
    Mythread m=new Mythread();
    Thread t=new Thread(m);
    t.start();
  }
}