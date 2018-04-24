package btt;

import java.util.Arrays;

public class baitap102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 11, 13, 31, 45, 20, 33, 53};
	    int kq = 1; 
		System.out.println("mang goc: "+Arrays.toString(mang)); 
		
		for(int i = 0; i < mang.length; i++)
	     {
	      	if(mang[i] == 10 || mang[i] == 30)
			{	
	  		
			   kq =0;
			}
	      }
		 if (kq==0)
	 	   System.out.printf( String.valueOf(true));	         
	     else
		   System.out.printf(String.valueOf(false));
	}

}
