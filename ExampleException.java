import java.io.*;
class ExampleException
{
    void print() throws IOException
        {
            throw new ArithmeticException("Exception in print");
        }
        public static void main(String args[])
        {
            try
            {
                ExampleException obj = new ExampleException();
                obj.print();
            }
            catch(IOException e)
            {
                System.out.println("Arithmetic Exception"+e);
            }
            finally
            {
                System.out.println("finally block...");
            }
            System.out.println("Rest of the code");
        }
}