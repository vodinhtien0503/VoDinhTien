package bt53;

import java.util.Arrays;

public class baitap27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {5, 7, 2, 4, 9};
		System.out.println("MANG GOC: "+Arrays.toString(mang)); 
		int ct = 0;
		for(int i = 0; i < mang.length; i++)
		{
			if(mang[i] % 2 == 0)
				ct++;
		}
		System.out.println("so chan : "+ct);
		System.out.println("so le  : "+(mang.length-ct));
	}

}
