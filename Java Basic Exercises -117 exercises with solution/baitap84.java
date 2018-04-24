package btt;

public class baitap84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String chuoi1 = "Python";
		    int sl = 3;
		    if (sl > chuoi1.length()) {
		      sl = chuoi1.length();
		    }

		    String sub = chuoi1.substring(chuoi1.length()-3);
		    System.out.println(sub + chuoi1 + sub);
	}

}
