package btt;

import java.util.Scanner;

public class baitap60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     System.out.print("nhap cau: ");
		 String cau = in.nextLine();
		 String[] tu = cau.split("[ ]+");
		 System.out.println("Penultimate word: "+tu[tu.length - 2]);
	}

}
