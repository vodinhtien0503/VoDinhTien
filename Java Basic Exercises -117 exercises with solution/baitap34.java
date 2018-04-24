package btt;

import java.util.Scanner;

public class baitap34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("nhap vao canh cua hinh luc giac : ");
double a=in.nextDouble();
System.out.println("dien tich cua hinh luc giac la"+(a*a*6)/(4*Math.tan(Math.PI/6)));
	}

}
