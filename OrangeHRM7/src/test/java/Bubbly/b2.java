package Bubbly;

import java.util.Scanner;

public class b2 {

	public static void main(String[] args) {
		
		b2 h1= new b2();
		
	String str2=	h1.HelloName1("SudhaRani");
	System.out.println("Print my Name is : "+str2);
	
		
		
		
		h1.HelloBubbly();
		h1.HelloName("Jyothi Prasanna");
		
		h1.HelloHoney();
		h1.HelloName("Sushma");
		
		h1.HelloMom();
		h1.HelloName("SudhaRani");
		

		double x= Math.pow(2, 3) ;
		System.out.println( " Math.pow(2, 3)" +x);
		
		h1.HelloDad();
		h1.HelloName("Ramesh");
		
		h1.HelloName("Ramesh","Sudharani","Honey");
		h1.HelloName("Ramesh","Sudharani","Honey","SudhaRani");
		h1.HelloName("Sudhakar","Dharmaja","Rithika","Ramcharan");
	
		b2.HelloName1("Sudhakar","Dharmaja","Rithika","Ramcharan");
		
		
		int d= h1.sum(50,60,70);
		System.out.println("sum of a,b,c " +d);
		
		int e= h1.multiplication(50,60,70);
		System.out.println("multiplication of a,b,c " +e);
		

		int f= h1.subtract(50,60,70);
		System.out.println("subtract of a,b,c " +f);

		int g= h1.division(80,10,30);
		System.out.println("division of a,b,c " +g);


	}
	
	//method without arguements
		public void HelloBubbly()
		{
		
			System.out.println("Hello Bubbly");
	
		}
		
		public void HelloName(String name)
		{
		 
			System.out.println("Hello my Name is : "+name);
	
		}
		
		
		public String HelloName1(String name)
		{

			name=name+ " " +"Kambham";
			System.out.println("Hello my Name is : "+name );
			return name;
	
		}
		
		public void HelloName(String name1,String name2,String name3)
		{
		 
			System.out.println("Name1 is : "+name1);
			System.out.println("Name2 is : "+name2);
			System.out.println("Name3 is : "+name3);
	
		}
		
		public void HelloName(String name1,String name2,String name3,String name4)
		{
		 
			System.out.println("______HelloName 4 arguements starts________");
			System.out.println("Name1 is : "+name1);
			System.out.println("Name2 is : "+name2);
			System.out.println("Name3 is : "+name3);
			System.out.println("Name3 is : "+name4);
			System.out.println("______HelloName 4 arguements ends________");
	
		}
		
		
		public static void HelloName1(String name1,String name2,String name3,String name4)
		{
		 
			System.out.println("______HelloName1 4 arguements starts________");
			System.out.println("Name1 is : "+name1);
			System.out.println("Name2 is : "+name2);
			System.out.println("Name3 is : "+name3);
			System.out.println("Name3 is : "+name4);
			System.out.println("______HelloName1 4 arguements ends________");
	
		}
		
		
		
		
		
		//method without arguements
				public void HelloHoney()
				{
				
					System.out.println("Hello Honey");
			
				}
				

				//method without arguements
						public void HelloDad()
						{
						
							System.out.println("Hello Dad");
					
						}
			
	

				//method without arguements
					public void HelloMom()
					{
					
						System.out.println("Hello Mom");
				
					}
	
	//method with arguements
	public int sum(int a,int b,int c)
	{
	
	int d=a+b+c;
	
	return d;
	}
	
	
	

	//method with arguements
	public int multiplication(int a,int b,int c)
	{
	
	int d=a*b*c;
	
	
	return d;
	}
	

	

	//method with arguements
	public int subtract(int a,int b,int c)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a-b-c;
	
	//System.out.println("Sum of a,b " +d);
	
	return f;
	}
	
	
	
	

	//method with arguements
	public int division(int a,int b,int c)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=(a+b)/c;
	
	
	
	return f;
	}
	
	
	
	
	
	
	
	
	
}
