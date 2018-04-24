package btt;

import java.util.Scanner;

public class baitap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long sonhiphan1, sonhiphan2;
		  int i = 0, n = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("nhap so nhi phan 1: ");
		  sonhiphan1 = in.nextLong();
		  System.out.print("nhap so nhi phan 2: ");
		  sonhiphan2 = in.nextLong();

		  while (sonhiphan1 != 0 || sonhiphan2 != 0) 
		  {
		   sum[i++] = (int)((sonhiphan1 % 10 + sonhiphan2 % 10 + n) % 2);
		   n = (int)((sonhiphan1 % 10 + sonhiphan2 % 10 + n) / 2);
		   sonhiphan1 = sonhiphan1 / 10;
		   sonhiphan2 = sonhiphan2 / 10;
		  }
		  if (n != 0) {
		   sum[i++] = n;
		  }
		  --i;
		  System.out.print("tong cua 2 so nhi phan: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
		   System.out.print("\n");  
		 }
	}


