package btt;

import java.util.Scanner;

public class baitap37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("nhap chuoi ki tu: ");
        char[] tu = in.nextLine().toCharArray();
        System.out.print("chuoi dao nguoc: ");
        for (int i = tu.length - 1; i >= 0; i--) {
            System.out.print(tu[i]);
        }
        System.out.print("\n");
    }
	}


