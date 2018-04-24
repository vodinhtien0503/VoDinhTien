package bt53;

import java.util.Arrays;

public class baitap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
	  System.out.println("mang goc  : "+Arrays.toString(mang));  
	   for(int i = 0; i < mang.length / 2; i++)
	  {
	    int temp = mang[i];
	    mang[i] = mang[mang.length - i - 1];
	    mang[mang.length - i - 1] = temp;
	  }
	    System.out.println("mang dao nguoc  : "+Arrays.toString(mang));
	 }
	}


