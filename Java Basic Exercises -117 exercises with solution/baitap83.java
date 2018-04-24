package btt;

import java.util.Arrays;

public class baitap83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kq = "";
		   int[] mang1 = {1, 3, -5, 4};
		   int[] mang2 = {1, 4, -5, -2};
		   System.out.println("\nmang1: "+Arrays.toString(mang1));  
		   System.out.println("\nmang2: "+Arrays.toString(mang2)); 
	       for (int i = 0; i < mang1.length; i++) {
					int num1 = mang1[i];
					int num2 = mang2[i];
					kq += Integer.toString(num1 * num2) + " "; 
				}
			System.out.println("\nket qua: "+kq); 
	}

}
