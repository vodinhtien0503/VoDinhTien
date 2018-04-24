package btt;

import java.util.Scanner;

public class baitap56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("so thu nhat : ");
	        int x = in.nextInt();  
			System.out.print("so thu hai: ");
			int y = in.nextInt(); 
			System.out.print("so thu ba : ");
	        int z = in.nextInt(); 
	        System.out.print("ket qua la : "+kt(x, y, z,true));
			System.out.print("\n");
	    }
	   
	    public static boolean kt(int p, int q, int r, boolean xyz)
	     {
		     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}

}
