package btt;

import java.util.Scanner;

public class baitap57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      System.out.print("nhap so nguyen : ");
	      int x = in.nextInt(); 

			System.out.println(kq(x));
		 } 		
		public static int kq(int so) {	
			int ctr = 0;
	        for(int i=1; i<=(int)Math.sqrt(so); i++) {
	            if(so%i==0 && i*i!=so) {
	                ctr+=2;
	            } else if (i*i==so) {
	                ctr++;
	            }
	        }
	        return ctr;
	}

}
