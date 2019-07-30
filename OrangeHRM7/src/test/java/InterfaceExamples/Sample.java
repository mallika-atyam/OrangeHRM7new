package InterfaceExamples;

interface  interfaceA1 {

	public  void Hello() ;
	
}

interface  interfaceB1 {

	public  void Hello();
	
}


class Sample implements interfaceA1,interfaceB1
{
	
	public static void main(String args[])
	{
		interfaceA1 A1= new Sample();
		A1.Hello();
		
		interfaceB1 B1= new Sample();
		B1.Hello();
		
	
	}
	

	


	public  void Hello()
	{
		System.out.println("Hai");
		
	}
	
}




