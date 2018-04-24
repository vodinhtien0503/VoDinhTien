package btt;

import java.util.Scanner;

public class baitap115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
	        Scanner in = new Scanner(System.in);	
	        System.out.print("nhap so : ");
	        int n = in.nextInt(); 
	        System.out.println("co la so..? "+n);
			System.out.println(kt(n)); 
	    }
	    
	private static boolean kt(int num) {
	        String str = String.valueOf(num);
	        int i = 0;
	        int j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i++) != str.charAt(j--)) {
	                return false;
	            }
	        }
	        return true;
	}

}
