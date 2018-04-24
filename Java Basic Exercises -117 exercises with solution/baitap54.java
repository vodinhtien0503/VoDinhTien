package btt;

import java.util.Scanner;

public class baitap54 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("nhap giay: ");
		int s=in.nextInt();
int p=s/60;
int h=p%60 ;
int dup=s%60;
p=p/60;
System.out.println(p+": "+h+": "+dup);

	}

}
