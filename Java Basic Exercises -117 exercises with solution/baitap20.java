package btt;

import java.io.InputStream;
import java.util.Scanner;

public class baitap20 {
	public static void main(String[] args) {
	 int  du;
     String sothaplucphan="";
     
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
     
     Scanner i= Scanner(System.in);
     System.out.println("nhap so thap phan: ");
   int  sothapphan = i.nextInt();	
     while(sothapphan>0)
     {
         du = sothapphan%16;
         sothaplucphan = hex[du] + sothaplucphan;
         sothapphan = sothapphan/16;
     }
     System.out.print("so thap luc phan la : "+sothaplucphan+"\n");         
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}


