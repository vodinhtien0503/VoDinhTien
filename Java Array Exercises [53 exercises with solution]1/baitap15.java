package bt53;

import java.util.Arrays;

public class baitap15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang1 = {1, 2, 5, 5, 8, 9, 7, 10};
	      int[] mang2 = {1, 0, 6, 15, 6, 4, 7, 0};
	 
	       System.out.println("mang1 : "+Arrays.toString(mang1));
	       System.out.println("mang2 : "+Arrays.toString(mang2));
	 
	      
	        for (int i = 0; i < mang1.length; i++)
	        {
	            for (int j = 0; j < mang2.length; j++)
	            {
	                if(mang1[i] == (mang2[j]))
	                {
	                 
	                 System.out.println("phan tu trung nhau la : "+(mang1[i]));
	                 }
	            }
	        }
	}

}
