package btt;

import java.util.Scanner;

public class baitap19 {
	 public static void main(String args[])
	    {
	        int a, b, n, i=1, j;
	        int m[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("nhap so thap phan : ");
	        a = scan.nextInt();
			
	        n = a;
			
	        while(n != 0)
	        {
	            m[i++] = n%2;
	            n = n/2;
	        }
			
	        System.out.print("so nhi phan: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(m[j]);
	        }
	        System.out.print("\n");
	    }
}
