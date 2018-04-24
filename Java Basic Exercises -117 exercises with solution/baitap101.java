package btt;

import java.util.Arrays;

public class baitap101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {10, 11, 10, 30, 45, 20, 33, 53};
	    int kq = 0; 
		System.out.println("mang goc: "+Arrays.toString(mang)); 
	    
		int c = 0;
	    int c1 = 0;
	      
	    for(int i = 0; i < mang.length; i++) {
	        if(mang[i] == 10)
	            c++;
	                        
	        if(mang[i] == 20)
	            c1++;
	    }                                      
	    System.out.printf(String.valueOf(c > c1));
		System.out.printf("\n");
	}

}
