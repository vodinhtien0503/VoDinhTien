package btt;

import java.util.Scanner;

public class baitap25 {

public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal, stp = 0;
     int i = 0;
     System.out.print("nhap so thap phan: ");
    octal = in.nextLong();
    while (octal != 0) 
     {
      stp = (long)(stp + (octal % 10) * Math.pow(8, i++));
      octal = octal / 10;
     }
    System.out.print("so thap phan : " + stp+"\n");
   }
}
