package  FAQS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallNumber
{
	
	public static void main(String args[])
	{

			int a[]={1,2,5,6,3,2,5};  
			Arrays.sort(a);
			System.out.println("Small number:"+a[0]);
			System.out.println("Big number:"+a[a.length-1]);
			
			//find duplicate numbers
			Set <Integer> duplicates = new HashSet<Integer>();	
			for(int i=0;i<a.length;i++)
			{
				if(duplicates.add(a[i])==false) 
				{
					System.out.println("dupliactes are :"+a[i]);
					
					
				}		
			}
			
			
			//find duplicate strings
			String a1[]={"Raju","Ravi","Ramu","Kiran","Ravi"};  
			Set <String> duplicates1 = new HashSet<String>();
			
			for(int i=0;i<a1.length;i++)
			{
				if(duplicates1.add(a1[i])==false) 
				{
					System.out.println("dupliactes are :"+a1[i]);
				}
					
			}
			
			
			
			
			
			
			
	}
	
}
