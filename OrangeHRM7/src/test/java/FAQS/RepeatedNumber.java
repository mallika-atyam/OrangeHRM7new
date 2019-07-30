package FAQS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedNumber {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,10,20,30,50,60};
		int b[] = null;
		
		int j=0;
		
		Set<Integer> deplicates=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(deplicates.add(a[i])==false)
			{
				System.out.println("Duplicate numbers"+a[i]);
			
			}
			
		}
		
		
		

	}

}
