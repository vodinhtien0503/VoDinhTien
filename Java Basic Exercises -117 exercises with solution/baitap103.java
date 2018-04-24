package btt;

import java.util.Arrays;

public class baitap103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {11, 10, 13, 10, 45, 20, 33, 53};
	    int kq = 0; 
		System.out.println("mang goc : "+Arrays.toString(mang)); 
		
		int l = mang.length - 1;
		int[] mangmoi;
		while(mang[l] != 10)
			l--;
		mangmoi = new int[mang.length - 1 - l];
		for(int i = l + 1; i < mang.length; i++)
			mangmoi[i - l - 1] = mang[i];
		System.out.println("mang moi : "+Arrays.toString(mangmoi));
	}

}
