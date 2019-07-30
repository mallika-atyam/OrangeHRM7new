package Bubbly;

import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		
	
		
		HelloWorld2 h1= new HelloWorld2();
		h1.hello();
		h1.Honey();
		
		h1.hello2(50,60,70);
		h1.hello2(80,90,70);
		
		int d=h1.hello3(100,200,300);
		
		System.out.println("Sum of a,b,c " +d);

	}
	
	//method without arguements and no return type
	public void hello()
	{
	System.out.println("Hello Bubbly");
	}
	
	//method without arguements and no return type
	public void Honey()
	{
	System.out.println("Hello Honey");
	}
	
	
	//method with arguements and no return type
	public void hello2(int a,int b,int c)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	//System.out.println("b value is" +c);
	
	int d=a+b+c;
	
	System.out.println("Sum of a,b,c " +d);
	}
	
	
	//method with arguements and return type int
	public int hello3(int a,int b,int c)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	//System.out.println("b value is" +c);
	
	int x=a+b+c;
	
	System.out.println("Hello3 - Sum of a,b,c " +x);
	
	return x;
	}
	
	
	
	
}
