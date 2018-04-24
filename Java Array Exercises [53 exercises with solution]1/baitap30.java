package bt53;

import java.util.Arrays;

public class baitap30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {50, 77, 12, 54, -11};
		System.out.println("mang goc : "+Arrays.toString(mang)); 
		System.out.println("ket qua : "+test(mang));
	    }	
	    public static boolean test(int[] numbers) {
	    for (int number : numbers) {
	      if (number == 0 || number == -1) {
	        return false;
	      }
	    }
	    return true;
	}

}
