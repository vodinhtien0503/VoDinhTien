package btt;

import java.util.Scanner;

public class baitap62 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("nhap so dau tien : ");
        int x = in.nextInt();  
		System.out.println("nhap so thu hai : ");
		int y = in.nextInt(); 
		System.out.println("nhap so thu ba : ");
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));

	}

}
