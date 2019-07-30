package Bubbly;

import java.util.Scanner;

public class b1 {

	public static void main(String[] args) {
		

		
		Scanner c1 = new Scanner(System.in);
		System.out.println("enter x1 ");
		int x1=c1.nextInt();
		System.out.println("enter y1 ");
		int y1=c1.nextInt();
		
		
		b1 h1= new b1();
		
		int d= h1.sum(x1,y1);
		System.out.println("sum of a,b " +d);
		System.out.println("___****Sum ****_____" );
		
		
		int e= h1.multiplication(x1,y1);
		System.out.println("multiplication of a,b " +e);
		System.out.println("___****Mul ****_____" );
		

		int f= h1.subtract(50,60);
		System.out.println("subtract of a,b " +f);

		int g= h1.division(20,10);
		System.out.println("division of a,b " +g);


	}
	

	
	
	//method with arguements
	public int sum(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a+b;
	
	//System.out.println("Sum of a,b " +d);
	
	return d;
	}
	
	
	

	//method with arguements
	public int multiplication(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a*b;
	
	
	return d;
	}
	

	

	//method with arguements
	public int subtract(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a-b;
	
	//System.out.println("Sum of a,b " +d);
	
	return f;
	}
	
	
	
	

	//method with arguements
	public int division(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a/b;
	
	
	
	return f;
	}
	
	
}
