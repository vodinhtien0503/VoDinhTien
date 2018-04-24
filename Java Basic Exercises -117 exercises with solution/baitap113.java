package btt;

import java.util.Arrays;

public class baitap113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mang1[]=new int[8];
		       mang1[0]=1;
		        mang1[1]=2;
		        mang1[2]=3;
		        mang1[3]=4;
		       int[] mang2 = {2,5,7,8};
		        System.out.println("\nmang1: "+Arrays.toString(mang1));  
			    System.out.println("\nmang2: "+Arrays.toString(mang2));
				int m =4, n=4;
				int i = m-1, j = n-1, index = m + n - 1;
		        while (i >= 0 && j >= 0) {
		            if (mang1[i] > mang2[j]) {
		                mang1[i--] = mang1[i--];
		            } else {
		                mang1[index--] = mang2[j--];
		            }
		        }
		        while (i >= 0) {
		            mang1[i--] = mang1[i--];
		        }
		        while (j >= 0) {
		            mang1[i--] = mang2[j--];
		        }
		 
		    	System.out.println("\n: "+Arrays.toString(mang1));
	}

}
