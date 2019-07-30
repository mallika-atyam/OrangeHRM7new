package June7;

public class TestClass implements PI1, PI2 {

	public static void main(String[] args) {
	
	
		TestClass d = new TestClass(); 
        d.show();
        d.show1();
        d.show2();
        
      // TestClass d1=new TestClass();
      //  d1.show();
     

	}

	 public void show() 
	    { 
	        // use super keyword to call the show 
	        // method of PI1 interface 
	        PI1.super.show(); 
	  
	        // use super keyword to call the show 
	        // method of PI2 interface 
	        PI2.super.show(); 
	    } 
	  
	 public void show1() 
	    { 
	        PI1.super.show(); 
	    } 
	 
	 public void show2() 
	    { 

	        PI2.super.show(); 
	    } 
	
	
}
