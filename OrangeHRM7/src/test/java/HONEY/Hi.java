package HONEY;

 interface Hi 
{

		
	static void show()	 
	{
		System.out.println("hai  i am static void ");
	}
	
	
	
	default void show2() 
	{
		System.out.println("hai  i am default void ");	
		
	}
	
	abstract void show3() ;
	
	
	
	
}
 