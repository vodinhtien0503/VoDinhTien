package btt;

import java.util.Scanner;

public class baitap36 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("nhap vao vi do diem thu nhat : ");
	double x1=in.nextDouble();
	System.out.println("nhap vao kinh do diem thu nhat : ");
	double y1=in.nextDouble();
	System.out.println("nhap vao vi do diem thu hai : ");
	double x2=in.nextDouble();
	System.out.println("nhap vao kinh do diem thu hai : ");
	double y2=in.nextDouble();
double r=6371.01;
x1=Math.toRadians(x1);
x2=Math.toRadians(x2);
y1=Math.toRadians(y1);
y1=Math.toRadians(y2);
System.out.println("khoang cach hai diem la: "+r * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2)));
}
}
