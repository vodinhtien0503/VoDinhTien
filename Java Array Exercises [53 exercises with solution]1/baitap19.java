package bt53;

import java.util.Scanner;

public class baitap19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m, n, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("so hang cua ma tran");
	      m = in.nextInt();
	      System.out.println("so cot cua ma tran");
	      n  = in.nextInt();
	 
	      int mang1[][] = new int[m][n];
	      int mang2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("nhap phan tu thu nhat cua ma tran");
	 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            mang1[c][d] = in.nextInt();
	 
	      System.out.println("nhap phan tu thu hai cua ma tran");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            mang2[c][d] = in.nextInt();
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = mang1[c][d] + mang2[c][d]; 
	 
	      System.out.println("tong cua ma tran :-");
	 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
	}

}
