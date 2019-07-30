package INTERFACE;

public class Sample implements INTERFACE {

	public static void main(String[] args)  {
		
		INTERFACE int1=new Sample();
		
		//public void calling
		int1.bubbly();
		
		
		// abstract void calling
		int1.bubbly1();
		
		
		//default method calling
		Sample s1= new Sample();
		s1.bubbly4();
		
		
		
		//interface method calling
		INTERFACE.bubbly3();
	}

	@Override
	public void bubbly() {
		System.out.println("Bubbly- Hai I am bubbly implemented in sub class");
		
	}

	@Override
	public void bubbly1() {
		System.out.println("Bubbly1- Hai I am bubbly1 implemented in sub class");
		
	}

}
