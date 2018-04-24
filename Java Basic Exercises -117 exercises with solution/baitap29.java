package btt;

import java.util.Scanner;

public class baitap29 {
	 public static int hex_to_decimal(String s)
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
	        int stp, i=1, j;
	        int snp[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("so thap luc phan  : ");
	        stlp = scan.nextLine();       
	        stp = hex_to_decimal(stlp);     
	        while(stp != 0)
	        {
	            snp[i++] = stp%2;
	            stp = stp/2;
	        }
			
	        System.out.print("so nhi phan : ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(snp[j]);
	        }
	        System.out.print("\n");
	    }
}
