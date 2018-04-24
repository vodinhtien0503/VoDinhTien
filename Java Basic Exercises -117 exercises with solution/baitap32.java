package btt;

import java.util.Scanner;

public class baitap32 {
public static void main(String[] args) {
	int a;
	int b;
	Scanner in= new Scanner(System.in);
	System.out.println("nhap a = ");
	a=in.nextInt();
	System.out.println("nhap b = ");
	b=in.nextInt();
	if(a!=b) {
		System.out.println(a+"!="+b);

	}
	  if(a<b) {
		System.out.println(a+"<"+b);

	}
	if(a<=b) {
		System.out.println(a+"<="+b);

	}
	if(a==b) {
		System.out.println(a+"="+b);
		
	}
	if(a>b) {
		System.out.println(a+">"+b);
	}
	if(a>=b) {
		System.out.println(a+">="+b);
	}

}
}
