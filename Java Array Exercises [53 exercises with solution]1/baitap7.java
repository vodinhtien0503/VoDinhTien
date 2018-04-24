package bt53;

import java.util.Arrays;

public class baitap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   
		   System.out.println("mang goc : "+Arrays.toString(mang));     
		   int vitrixoa = 1;

		   for(int i = vitrixoa; i < mang.length -1; i++){
		        mang[i] = mang[i + 1];
		      }
		    System.out.println("sau khi xoa phan tu thu 2: "+Arrays.toString(mang));
		 
	}

}
