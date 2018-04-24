package btt;

import java.util.Scanner;

public class baitap109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);	
	       System.out.print("nhap so: ");
	        int n = in.nextInt(); 
			if (n>0)
			{
	           System.out.println("so cua cot : "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}       	
	}

}
