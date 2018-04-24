package btt;

import java.util.Arrays;

public class baitap106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 15, 13, 10, 45, 20};
	    System.out.println("mang goc : "+Arrays.toString(mang)); 
		
		if(mang.length >1)
	    {          
	    int first = mang[0];
	              
	    for(int i = 1; i < mang.length; i++)
	        mang[i - 1] = mang[i];
	                        
	    mang[mang.length - 1] = first;
		System.out.println("mang moi: "+Arrays.toString(mang));
	}

	}
}
