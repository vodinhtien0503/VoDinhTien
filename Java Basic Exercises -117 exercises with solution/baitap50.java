package btt;

public class baitap50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("chia het cho 3: ");
for(int i=1;i<=100;i++) {
	if(i%3==0) {
		System.out.println(i+",");
	}
}
System.out.println("chia het cho 5: ");

	for(int i=1;i<=100;i++) {
	if(i%5==0) {
		System.out.println(i+",");
	}
	}
	System.out.println("chia het cho 5 va 3: ");

	for(int i=1;i<=100;i++) {

	if(i%3==0||i%5==0) {
		System.out.println(i+",");
	}
	}
	System.out.println("\n");

	}
}
	

