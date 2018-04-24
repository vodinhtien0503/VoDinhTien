package btt;

import java.util.Arrays;

public class baitap82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {20, 30, 40, 50, 67};
		System.out.println("mang goc : "+Arrays.toString(i)); 
		int m = i[0];
		if(m <= i[i.length-1])
			m = i[i.length-1];
		if(m <= i[i.length/2])
			m = i[i.length/2];
		System.out.println("gia tri lon nhat giua phan tu dau va cuoi : "+m);
	}

}
