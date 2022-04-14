public class DemoThread extends Thread
{
    public void run()
    {
        System.out.println("Now, Inside The Run Method");
    }
    public static void main(String[] args) 
    {
        DemoThread my_thr_1 =new DemoThread();
        DemoThread my_thr_2 =new DemoThread(); 
        System.out.println("The Thread Priority Of First Thread is : " +my_thr_1.getPriority());
        System.out.println("The Thread Priority Of Second Thread is : " +my_thr_2.getPriority());

        my_thr_1.setPriority(7);
        my_thr_2.setPriority(3);
        System.out.println("After Change The Thread Priority Of First Thread is : " +my_thr_1.getPriority());
        System.out.println("After Change The Thread Priority Of Second Thread is : " +my_thr_2.getPriority());

        System.out.println(Thread.currentThread().getName());
        
        System.out.println("The Thread Priority Of Main Thread is : " +Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("After Change The Thread Priority Of Main Thread is : " +Thread.currentThread().getPriority());
    }
}