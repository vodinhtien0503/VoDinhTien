package btt;

import java.util.Scanner;

public class baitap21 {
	 public static void main(String args[])
	    {
	            int sothaphan, du, nguyen, i=1, j;
	        int oct[] = new int[100];
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("nhap mot so thap phan : ");
	        sothaphan = scan.nextInt();
			
	        nguyen = sothaphan;
			
	        while(nguyen != 0)
	        {
	            oct[i++] = nguyen%8;
	            nguyen = nguyen/8;
	        }
			
	        System.out.print("so bat phan la: ");
	        for(j=i-1; j>0; j--)
	        {
	            System.out.print(oct[j]);
	        }
			System.out.print("\n");
	    }
}
