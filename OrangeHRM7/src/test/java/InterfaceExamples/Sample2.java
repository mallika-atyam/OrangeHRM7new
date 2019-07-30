package InterfaceExamples;

interface  interfaceX1 {

	public  void Hai() ;
	
}


interface  interfaceY1 {

	public  void Hello();
	
}


class Sample2 implements interfaceX1,interfaceY1
{
	
	public static void main(String args[])
	{
		interfaceX1 A1= new Sample2();
		A1.Hai();
		
		interfaceY1 B1= new Sample2();
		B1.Hello();

	}
	

	
	public  void Hello()
	{
		System.out.println("Hello");
		
	}
	
	public  void Hai()
	{
		System.out.println("Hai");
		
	}
	
	
}




