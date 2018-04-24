package btt;

import java.util.Scanner;

public class baitap55 {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("x= ");
	int x=in.nextInt();
	System.out.println("y= ");
	int y=in.nextInt();
	System.out.println("p= ");
	int p=in.nextInt();
	int s=0;
	for(int i=x;i<=y;i++) {
		if(i%p==0) {
			s=s+1;
		}
	}
	System.out.println("tong: "+s);
}
}
