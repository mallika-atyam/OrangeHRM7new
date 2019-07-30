package FAQS;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		
		int a[]= {50,30,40,10,5,1,3};
		Arrays.sort(a);
		System.out.println("Output:"+Arrays.toString(a));
		
		//FInd max number

		
		System.out.println("Max Number:"+a[a.length-1]);		
		System.out.println("Min Number:"+a[0]);
		

	}

}
