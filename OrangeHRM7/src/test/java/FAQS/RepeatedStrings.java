package FAQS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatedStrings {

	public static void main(String[] args) {
		
		
		String a[]= {"Honey","Honey","Buubbly","Sudhakar","Raju","Raju"};

		
		Set<String> deplicates=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(deplicates.add(a[i])==false)
			{
				System.out.println("Duplicates: "+a[i]);
			
			}
			
		}
		
		
		

	}

}
