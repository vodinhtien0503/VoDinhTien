package btt;

import java.util.Scanner;

public class baitap61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("nhap chuoi ki tu: ");
        String tu=in.nextLine();
        tu=tu.trim();
        char[] ch = tu.toCharArray();
        System.out.print("chuoi dao nguoc: ");
        String kq="";
        for (int i = ch.length - 1; i >= 0; i--){
        	 kq+= ch[i];
        }
        System.out.print(kq.trim());

	}

}
