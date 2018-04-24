package btt;

public class baitap66 {

	public static void main(String[] args) {
		 int sum = 1;
		 int dem = 0; 
		 int n = 0; 
	    	
			while (dem < 100) {
				n++; 
				if (n % 2 != 0) { 
					if (thu(n)) {
						sum += n; 
						dem++; 
					}
				}	
			}
			System.out.println("\ntong 100 so nguyen to dau tien "+sum); 	
		 }
		
	   	public static boolean thu(int n) {
			for (int i = 3; i * i <= n; i+= 2) {
				if (n % i == 0) {
					return false; 
				}
			}
			return true;
		}

}
