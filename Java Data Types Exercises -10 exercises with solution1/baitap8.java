package bttt;

import java.util.Scanner;

public class baitap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("nhap so : ");
        double giatri = in.nextDouble();

        System.out.println("hinh vuong: \n" +giatri * giatri);
        System.out.println("khoi lp phuong: \n"+ giatri * giatri * giatri);
        System.out.println("tu dien: \n"+ Math.pow(giatri, 4));
	}

}
