package btt;

import java.util.Arrays;

public class baitap105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 15, 13, 10, 45, 20, 11, 15};
	    System.out.println("mang goc : "+Arrays.toString(mang)); 
		
		int result = 0;
		int l = 2;
	    int dau = 0;
		int cuoi = mang.length-l;
		for(; l > 0; l--)
		{
			if(mang[dau] != mang[cuoi])
				result = 1;
			else
			{
				dau++;
				cuoi++;
			}
		}
		                
	    if (result==1)
		 {
		  System.out.printf(String.valueOf(false));
		 }
		else
		 {
		   System.out.printf(String.valueOf(true));
		 }
		 System.out.printf("\n");	
	}

}
