package btt;

import java.util.Scanner;

public class baitap110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int kt = 0;
		   Scanner in = new Scanner(System.in);	
		   System.out.print("nhap so : ");
		   int n = in.nextInt(); 
	       if (n < 1) {
				 System.out.print(Boolean.toString(false));
				 kt = 1;
			}
			if ((n & (n - 1)) != 0) {
				System.out.print(Boolean.toString(false));
				kt = 1;
			}
			if (kt==0)
			{
				System.out.print(Boolean.toString((n & 0x55555555) != 0));      	
			}
			System.out.print("\n");
	}

}
