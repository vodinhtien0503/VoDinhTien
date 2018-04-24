package btt;

import java.util.Scanner;

public class baitap112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
		System.out.print("nhap so : ");
	    int n = in.nextInt(); 
        int n1 = n;
		long ct = 0;
		while (n != 0) 
		{
			ct += n / 5;
			n /= 5;
		}
		System.out.printf("ket qua : ",n1,ct);
		System.out.printf("\n");      	   
	}

}
