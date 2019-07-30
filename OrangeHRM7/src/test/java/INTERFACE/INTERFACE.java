package INTERFACE;

 interface INTERFACE 
{	 
public  void bubbly();

//Static void method

	static  void bubbly3()
	{
		System.out.println("Bubbly3- Hai I am static method in Interface class");
	}

abstract void bubbly1();


//Default void method

default  void bubbly4()
{
	System.out.println("Bubbly4- Hai I am default method in Interface class");
}



 /*	//for private void we don't get output

	private  void bubbly2()
	{
		System.out.println("Bubbly2- Hai I am bubbly2");
	}*/

}