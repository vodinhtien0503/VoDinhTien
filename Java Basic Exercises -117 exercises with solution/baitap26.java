package btt;

import java.util.Scanner;

public class baitap26 {
	public static void main(String[] args) 
	 {
	  Scanner in = new Scanner(System.in);
	  int[] octal = {0, 1, 10, 11, 100, 101, 110, 111};
	  long octall, t,snp , cho;
	  int du;
	  System.out.print("nhap so bat phan: ");
	  octall = in.nextLong();
	  t = octall;
	  snp = 0;
	  cho = 1;
	  while (t != 0)
	  {
	   du = (int)(t % 10);
	   snp = octal[du] * cho + snp;
	   t /= 10;
	   cho *= 1000;
	  }
	  System.out.print("so thi phan la : " + snp+"\n");
	 }
}
