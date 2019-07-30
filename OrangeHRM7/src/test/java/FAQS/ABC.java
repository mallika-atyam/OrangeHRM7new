package  FAQS;

import org.testng.annotations.Test;

public class ABC
{
	private void ABC()
	{
		System.out.println("ABC constructor method");
	}
	public void Hello()
	{
		//System.out.println("Hello method - in Base Class ");
		int a=1;
		System.out.println("Value"+a);
	}
	
	public void Hello2()
	{
		System.out.println("Hello2 method - in Base Class ");
	}
	
}

class DEF extends ABC
{
	public void DEF()
	{
		System.out.println("DEF Constructor  method");
	}
	public void Hello()
	{
		//System.out.println("Hello DEF - in Drived class");
		int a=5;
		System.out.println("Value"+a);
		
	}
	
	@Test
	public static void main() throws Exception 
	{
		ABC  A = new DEF();
		A.Hello();
	
	
	}
	
		 
}
	


	
	