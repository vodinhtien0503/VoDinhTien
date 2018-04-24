package bttt;

import java.util.Scanner;

public class baitap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);

        System.out.print("nhap can nang : ");
        double kganh = i.nextDouble();

        System.out.print("nhap chieu cao: ");
        double inch = i.nextDouble();

        double BMI = kganh * 0.45359237 / (inch * 0.0254 * inch * 0.0254);
        System.out.print("chi so co the la " + BMI+"\n");
	}

}
