package InterfaceExamples;

interface  interfaceP2 {

	public  void greek() ;
	
}


interface  interfaceQ2 {

	public  void greek();

	
}


class Sample3 implements interfaceP2,interfaceQ2
{
	
	public static void main(String args[])
	{
		//interfaceP2 P2= new Sample3();

				//P2.greek();
		interfaceQ2 Q2= new Sample3();
		Q2.greek();
	}
	


	
/*	public int greek()
	{
		int a=10;
		System.out.println("Hai");
		retun a;
	
	}*/
	
	public void greek()
	{
		
		System.out.println("Hello 123");
	
	}
	
	
}




