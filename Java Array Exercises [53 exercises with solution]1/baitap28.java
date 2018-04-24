package bt53;

import java.util.Arrays;

public class baitap28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {5, 7, 2, 4, 9};
		System.out.println("mang goc: "+Arrays.toString(mang)); 
		int gtln = mang[0];
		int min = mang[0];
		for(int i = 1; i < mang.length; i++)
		{
			if(mang[i] > gtln)
				gtln = mang[i];
			else if(mang[i] < min)
				min = mang[i];
		}
		System.out.println("so lon nhat lon hon so nho nhat: "+(gtln-min));	
	}

}
