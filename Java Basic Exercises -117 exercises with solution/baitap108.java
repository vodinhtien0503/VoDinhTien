package btt;

import java.util.Scanner;

public class baitap108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);	
	       System.out.print("nhap so : ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.print("tong cac chu so : "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
			}
			System.out.println("\n"); 
	}

}
