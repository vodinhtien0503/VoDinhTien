package bt53;

import java.util.Arrays;

public class baitap18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {
	            10789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
	System.out.println("mang goc : "+Arrays.toString(mang));            
	Arrays.sort(mang);
	int index = mang.length-1;
	while(mang[index]==mang[mang.length-1]){
	index--;
	}
	System.out.println("gia tri lon thu hai : " + mang[index]);
	}
	}


