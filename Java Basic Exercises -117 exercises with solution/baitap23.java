package btt;

import java.util.Scanner;

public class baitap23 {
	public static void main(String[] args) 
	 {
	  int[] hex = new int[1000];
	  int i = 1, j = 0, du, dec = 0, b;
	  Scanner in = new Scanner(System.in);
	  System.out.print("nhap mot so nhi phan : ");
	  b = in.nextInt();
	  while (b > 0) {
	   du = b % 2;
	   dec = dec + du * i;
	   i = i * 2;
	   b = b / 10;
	  }
	   i = 0;
	  while (dec != 0) {
	   hex[i] = dec % 16;
	   dec = dec / 16;
	   i++;
	  }
	  System.out.print("so thap luc phan : ");
	  for (j = i - 1; j >= 0; j--)
	  {
	   if (hex[j] > 9) 
	   {
	    System.out.print((char)(hex[j] + 55)+"\n");
	   } else
	   {
	    System.out.print(hex[j]+"\n");
	   }
	  }
	 }
}
