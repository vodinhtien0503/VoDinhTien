package btt;

public class baitap72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";    
		int i = str1.length();
		if(i >= 3)
			System.out.println( str1.substring(0, 3));
		else if(i == 1)
			System.out.println( (str1.charAt(0)+"##"));
		else
			System.out.println("###");
		
	}

}
