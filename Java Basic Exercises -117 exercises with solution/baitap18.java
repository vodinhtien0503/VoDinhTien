package btt;

import java.util.Scanner;

public class baitap18 {
	public static void main(String[] args)
	 {
	  long snp1, snp2, m = 0;
	  int d, f = 1;
	  Scanner in = new Scanner(System.in);
	  System.out.print("nhap vao so nhi phan thu nhat: ");
	  snp1 = in.nextLong();
	  System.out.print("nhap vao so nhi phan thu hai: ");
	  snp2 = in.nextLong();
	  while (snp2 != 0)
	  {
	   d = (int)(snp2 % 10);
	   if (d == 1) 
	   {
	    snp1 = snp1 * f;
	    m = binaryproduct((int) snp1, (int) m);
	   } 
	   else
	   {
	    snp1 = snp1 * f;
	   }
	   snp2 = snp2 / 10;
	   f = 10;
	  }
	  System.out.print("san pham cua hai so nhi phan : " + m+"\n");
	 }
	 static int binaryproduct(int snp1, int snp2) 
	 {
	  int i = 0, n = 0;
	  int[] sum = new int[20];
	  int binary_prod_result = 0;

	  while (snp1 != 0 || snp1 != 0) 
	  {
	   sum[i++] = (snp1 % 10 + snp1 % 10 + n) % 2;
	   n = (snp1 % 10 + snp1 % 10 + n) / 2;
	   snp1 = snp1 / 10;
	   snp1 = snp1 / 10;
	  }
	  if (n != 0)
	  {
	   sum[i++] = n;
	  }
	  --i;
	  while (i >= 0) 
	  {
	   binary_prod_result = binary_prod_result * 10 + sum[i--];
	  }
	  return binary_prod_result;
	 }
	 }
	 

