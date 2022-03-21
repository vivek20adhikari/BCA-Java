class StringDemo
{
	public static void main(String args[])
	{
		String s="My Name Is Vivek Singh Adhikari";
		char Chars[]={'a','b','c'};
		String ss=new String(Chars);
		System.out.println("Usage Of Length! ");
		System.out.println(s.length());
		char result=s.charAt(8);
		System.out.println("Usage Of charAt! ");
		System.out.println(result);
		String s1="BCA";
		String s2="M2";
		String s3="BCA";
		System.out.println("Usage Of equal! ");
		System.out.println(s1+" equal "+s2+" -> "+s1.equals(s2));
		System.out.println(s1+" equal "+s3+" -> "+s1.equals(s3));
	}
}
		
		
		