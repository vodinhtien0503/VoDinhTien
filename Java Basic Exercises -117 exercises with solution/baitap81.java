package btt;

import java.util.Arrays;

public class baitap81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]= {1,2,3};
System.out.println("mang goc : "+Arrays.toString(i));
int n= i[0];
i[0]=i[i.length-1];
i[i.length-1]=n;
System.out.println("mang moi: "+Arrays.toString(i));
	}

}
