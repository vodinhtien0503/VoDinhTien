package bttt;

import java.util.Scanner;

public class baitap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 

		float timeSeconds;
		float mps,kph, mph;

		System.out.print("nhap khoang cach: ");
		float distance = s.nextFloat();

		System.out.print("nhap gio: ");
		float h = s.nextFloat();

		System.out.print("nhap phut : ");
		float p = s.nextFloat();

		System.out.print("nhap giay: ");
		float se = s.nextFloat();

		timeSeconds = (h*3600) + (p*60) + se;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("toc do cua ban km/s la  "+mps);
		System.out.println("toc do cua ban km/h la "+kph);
		System.out.println("toc do cua ban dam/h la "+mph);
	}

}
