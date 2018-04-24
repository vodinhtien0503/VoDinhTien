package bttt;

import java.util.Scanner;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);

        System.out.print("nhap so trong khoang 0 den 1000: ");
        int so = i.nextInt();

        int chuso1 = so % 10;
        int sodu = so / 10;
        int chuso2 = sodu % 10;
        sodu = sodu / 10;
        int chuso3 = sodu % 10;

        int sum = chuso3 + chuso2 + chuso1;

        System.out.println("tong cac chu so cua " + so + " la " + sum);

	}

}
