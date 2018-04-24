package btt;

import java.util.Scanner;

public class baitap24 {
	public static void main(String[] args) 
    {
        int snp, snp1,du, stp=0, t, i=1, j;
        int oct[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("nhap so nhi phan : ");
        snp = scan.nextInt();
        snp1=snp;
     
      while(snp > 0)
        {
            du = snp % 10;
            stp = stp + du*i;
    
            i = i*2;
            snp = snp/10;
        }   

		i=1;
        t = stp;
		
        while(t > 0)
        {
            oct[i++] = t % 8;
            t = t / 8;
        }
		
        System.out.print("so bat phan" +snp1+ " la :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct[j]);
        }
 System.out.print("\n");
 
    }
}
