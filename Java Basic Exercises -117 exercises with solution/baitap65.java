package btt;

import java.util.Scanner;

public class baitap65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("nhap so thu nhat : ");
	        int a = in.nextInt();  
			System.out.print("nhap so thu hai: ");
			int b = in.nextInt(); 
			int chia = a / b;
			int ketqua = a - (chia * b);
			System.out.println(ketqua); 
	}

}
