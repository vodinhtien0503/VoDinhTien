package btt;

import java.util.Scanner;

public class baitap22 {
	public static void main(String[] args) 
	 {
	  Scanner sc = new Scanner(System.in);
	  long snp, stp = 0, j = 1, n;
	  System.out.print("nhap mot so nhi phan: ");
	  snp = sc.nextLong();

	  while (snp != 0) 
	  {
	   n = snp % 10;
	   stp = stp + n * j;
	   j = j * 2;
	   snp = snp / 10;
	  }
	  System.out.println("so thap phan: " +stp);
	 }
}
