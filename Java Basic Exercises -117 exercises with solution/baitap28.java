package btt;

import java.util.Scanner;

public class baitap28 {
	 public static int stlp(String s)
	    {
	             String digits = "0123456789ABCDEF";
	             s = s.toUpperCase();
	             int val = 0;
	             for (int i = 0; i < s.length(); i++)
	             {
	                 char c = s.charAt(i);
	                 int d = digits.indexOf(c);
	                 val = 16*val + d;
	             }
	             return val;
	    }
	    public static void main(String args[])
	    {
	        String stlp;
	        int stp;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("nhap so thap luc phan la: ");
	        stlp = scan.nextLine();
			
	        stp = stlp(stlp);
			
	        System.out.print(" so thap phan la : " + stp+"\n");
	    }
}
