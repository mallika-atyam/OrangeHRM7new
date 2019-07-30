package HONEY;

public abstract class B1 implements Hi {

	public static void main(String[] args) {
	
		B1 b1 = new B1();
		BUBBU1 b2= new BUBBU1();
		
		 b1.show();
		 
		Hi.show1();
		
		
		
		show3();
		
		show4();
		
		
		 b2.show5();
		
	}
 
	static void show4()
	{
		System.out.println("hai show4");	
	}
	
	public void show()	 
	{
		System.out.println("hai show");
	}

	static void show1()	 
	{
		System.out.println("hai show1");
	}
	static void show3()	 
	{
		System.out.println("hai show3");
	}
	
	abstract void show5(); 
	{
		System.out.println("hai show5");
	}
	
	
}