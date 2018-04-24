package bt53;

import java.util.Arrays;

public class baitap29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] mang = {5, 7, 2, 4, 9};
			System.out.println("mang goc: "+Arrays.toString(mang)); 
			int max = mang[0];
			int min = mang[0];
			float sum = mang[0];
			for(int i = 1; i < mang.length; i++)
			{
				sum  += mang[i];
				if(mang[i] > max)
					max = mang[i];
				else if(mang[i] < min)
					min = mang[i];
			}
			float x = ((sum-max-min) / (mang.length - 2));
			System.out.println("gia tri trung binh tru so lon nhat va nho nhat "+x);
			System.out.print("\n");	
	}

}
