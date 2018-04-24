package bttt;

import java.util.Scanner;

public class baitap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner i = new Scanner(System.in);

	        System.out.print("nhap thoi gian mui gmt: ");
	        long tgmui = i.nextInt();

	        long t = System.currentTimeMillis();

	        long s1 = t / 1000;

	        long s2 = s1 % 60;

	        long p1 = s1 / 60;

	        long p2 = p1 % 60;

	        long h1 = p1 / 60;

	        long h2 = ((h1 + tgmui) % 24);

	        System.out.println("thoi gian chuan la :  " + h1 + ":" + p1 + ":" + s1);
	}

}
