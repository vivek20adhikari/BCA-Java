public class NameChange
{
    public static void main(String[] args) 
    {
        Thread t=Thread.currentThread();
        System.out.println("Current Thread : " +t);
        t.setName("My Thread");         //change the name of thread
        System.out.println("After Name Change : " +t);
    }
}