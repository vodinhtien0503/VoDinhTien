package bttt;

import java.util.Scanner;

public class baitap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sophut1nam = 60 * 24 * 365;

        Scanner i = new Scanner(System.in);

        System.out.print("nhap so phut : ");

        double phut = i.nextDouble();

        long nam = (long) (phut / sophut1nam);
        int ngay = (int) (phut / 60 / 24) % 365;

        System.out.println((int) phut + " chuyen thanh " + nam + " nam va " + ngay + " ngay");
	}

}
