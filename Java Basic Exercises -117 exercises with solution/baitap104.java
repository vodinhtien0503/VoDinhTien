package btt;

import java.util.Arrays;

public class baitap104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 15, 13, 10, 45, 20, 33, 53};
	    int kq = 0; 
		System.out.println("Original Array: "+Arrays.toString(mang)); 
		
		int l = 0;
		int[] mangmoi;
		while(mang[l] != 10)
		  l++;
		mangmoi = new int[l];
		for(int i = 0; i < l; i++)
			mangmoi[i] = mang[i];
		System.out.println("New Array: "+Arrays.toString(mangmoi));
	}

}
