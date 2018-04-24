package btt;

public class baitap73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String chuoi1 = "Python"; 
			String chuoi2 = ""; 
			
			int length2 = chuoi2.length();
			String kq = "";
			kq += (chuoi1.length() >= 1) ? chuoi1.charAt(0) : '#';
			kq += (length2 >= 1) ? chuoi2.charAt(length2-1) : '#';
			System.out.println(kq);
	}

}
