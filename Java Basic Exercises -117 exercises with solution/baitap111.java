package btt;

import java.util.Scanner;

public class baitap111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x, y ;
		   Scanner in = new Scanner(System.in);	
		   System.out.print("nhap so thu nhat : ");
		   x = in.nextInt(); 
		   System.out.print("nhap so thu hai : ");
		   y = in.nextInt(); 
	      while(y != 0){
	            int i = x & y;
	            x = x ^ y;
	            y = i << 1;
	        }
	        System.out.print("tong: "+x); 
			System.out.print("\n"); 
	}

}
