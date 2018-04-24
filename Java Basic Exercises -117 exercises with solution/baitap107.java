package btt;

import java.util.Arrays;

public class baitap107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 12, 13, 14, 45, 20};
	    System.out.println("mang goc: "+Arrays.toString(mang)); 
		int kq =1;
		
	      for(int i = 0; i <= mang.length - 3; i++) {
	        if(mang[i] + 1 == mang[i+1] && mang[i+1] + 1 == mang[i+2])
	            kq =0;
	    }
	                
		if (kq==1)
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
