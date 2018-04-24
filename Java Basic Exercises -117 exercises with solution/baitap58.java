package btt;

import java.util.Scanner;

public class baitap58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.print("nhap chuoi: ");
		 String line = in.nextLine();
		 String u = ""; 
	       Scanner l = new Scanner(line); 
	         while(l.hasNext()) {
	             String word = l.next(); 
	             u += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	      System.out.println(u.trim());
	}

}
