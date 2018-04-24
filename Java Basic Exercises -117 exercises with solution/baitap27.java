package btt;

import java.util.Scanner;

public class baitap27 {
	public static void main(String args[])
    {
        String sbp, tlp;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("nhap so bat phan : ");
        sbp = in.nextLine();
		
        decnum = Integer.parseInt(sbp, 8);
        tlp = Integer.toHexString(decnum);
		
        System.out.print("so thap luc phan : "+ tlp+"\n");
     }
}

