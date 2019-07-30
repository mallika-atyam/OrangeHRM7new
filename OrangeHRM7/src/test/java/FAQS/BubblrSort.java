package FAQS;

import java.util.Arrays;

public class BubblrSort {

	public static void main(String[] args) {
	
		int a[]= {50,60,40,30,20,1,5,8};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
	  System.out.println("Output:"+Arrays.toString(a));
	  
	  System.out.println("Max number "+a[a.length-1]);
	  System.out.println("Min number "+a[0]);

	}

}
