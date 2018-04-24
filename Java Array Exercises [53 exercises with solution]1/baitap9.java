package bt53;

import java.util.Arrays;

public class baitap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	   
	   int vitri = 2;
	   int giatrimoi    = 5;

	  System.out.println("mang goc : "+Arrays.toString(array));     
	   
	  for(int i=array.length-1; i > vitri; i--){
	    array[i] = array[i-1];
	   }
	  array[vitri] = giatrimoi;
	   System.out.println("mang moi: "+Arrays.toString(array));
	}

}
