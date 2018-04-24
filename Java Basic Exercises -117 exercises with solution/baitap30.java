package btt;

import java.util.Scanner;

public class baitap30 {
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
        int stp, i=1, j;
        int octal[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.print("nhap so thap luc phan: ");
        stlp = in.nextLine();
        stp = stlp(stlp);
        while(stp != 0)
        {
            octal[i++] = stp%8;
            stp = stp/8;
        }
        System.out.print("so bat phan: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octal[j]);
        }
		System.out.print("\n");
    }
}
