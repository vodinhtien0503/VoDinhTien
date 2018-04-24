package bttt;

import java.util.Scanner;

public class baitap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);

        System.out.print("nhập độ f cần chuyển đổi : ");
        double f = i.nextDouble();

        double  c =(( 5 *(f - 32.0)) / 9.0);
        System.out.println(f + "chuyển đổi thành " + c + " độ c");
	}

}
