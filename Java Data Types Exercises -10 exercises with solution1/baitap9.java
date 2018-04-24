package bttt;

import java.util.Scanner;

public class baitap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("nhap so thu 1: ");
        int sothu1 = in.nextInt();
        System.out.print("nhap so thu 2: ");
        int sothu2 = in.nextInt();

        System.out.printf("tong : %d%n", sothu1 + sothu2);
        System.out.printf("khac: %d%n", sothu1 - sothu2);
        System.out.printf("tich: %d%n", sothu1 * sothu2);
        System.out.printf("tb: %.2f%n", (double) (sothu1 + sothu2) / 2);
        System.out.printf("kc: %d%n", Math.abs(sothu1 - sothu2));
        System.out.printf("so lon : %d%n", Math.max(sothu1, sothu2));
        System.out.printf("so nho: %d%n", Math.min(sothu1, sothu2));
	}

}
