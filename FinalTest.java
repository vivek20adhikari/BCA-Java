class FinalTest
{
    final int value=20;
    final void changeValue()
    {
        value=10;
    }
    public static void main(String[] args) 
    {
        FinalTest f=new FinalTest();
        System.out.println("Value is : "+f.value);
        f.changeValue();   
    }
}