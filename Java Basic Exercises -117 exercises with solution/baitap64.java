package btt;

import java.util.Scanner;

public class baitap64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        System.out.print("nhap so thu nhat : ");
	        int a = in.nextInt();  
			System.out.print("nhap so thu hai : ");
			int b = in.nextInt(); 
			System.out.println("ket qua: "+st(a, b));
	    }
		
		public static boolean st(int n, int m)
	     {  
		   if (n<25 || m>75)
			   return false;
		   int x = n % 10;
		   int y = m % 10;
		   n /= 10;
		   m /= 10;
		   return (n == m || n == y || x == m || x == y);
	}

}
