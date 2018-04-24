package btt;

import java.util.Scanner;

public class baitap63 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap so dau tien : ");
		int a=in.nextInt();
		System.out.println("nhap so thu hai : ");
		int b=in.nextInt();
		if(a<b) {
			System.out.println(b);
		}
		else if(a==b) {
			System.out.println(0);
		}
		else if(a%6==b%6||a<b) {
			System.out.println(a);
			
		}
		else if(a%6==b%6||b>a) {
			System.out.println(b);
		}

	}

}
