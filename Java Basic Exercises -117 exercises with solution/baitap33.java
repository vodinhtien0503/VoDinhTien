package btt;

import java.util.Scanner;

public class baitap33 {

	public static void main(String[] args) {
		Scanner i =new  Scanner(System.in);
System.out.println("nhap vao so nguyen = ");
long a=i.nextLong();
System.out.print("tong cac chu so cua so nguyen la "+sum(a));
	}
public static  int sum(long a) {
	int s=0;
	while(a!=0) {
		s +=a%10;
		a/=10;
	}
	return s;
}
}
