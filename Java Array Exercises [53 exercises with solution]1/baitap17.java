package bt53;

import java.util.Arrays;

public class baitap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {-1, 4, 0, 2, 7, -3};
	    System.out.println("mang goc  : "+Arrays.toString(mang));
	    int min = Integer.MAX_VALUE;
	    int second_min = Integer.MAX_VALUE;
	    for (int i = 0; i < mang.length; i++) {
	        if(mang[i]==min){
	          second_min=min;
	        } else if (mang[i] < min) {
	            second_min = min;
	            min = mang[i];
	        } else if (mang[i] < second_min) {
	            second_min = mang[i];
	        }

	    }
	    System.out.println(" so nho thu hai cua mang la : " + second_min);
	    }
	

}
