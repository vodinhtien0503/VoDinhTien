package btt;

import java.util.Scanner;

public class baitap35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("nhap vao so mat cua da giac : ");
double a=in.nextDouble();
System.out.println("nhap vao chieu dai mot mat cua da giac : ");
double n=in.nextDouble();
System.out.println("dien tich cua hinh luc giac la "+(n*n*a)/(4*Math.tan(Math.PI/a)));
	}
}
