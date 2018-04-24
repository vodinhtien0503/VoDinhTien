package bt31;

public class baitap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "w3resource.com";
	    System.out.println("mang goc : " + str);
	        
	   
	    int val1 = str.codePointBefore(1);
	    int val2 = str.codePointBefore(9);
	    System.out.println("tu(ma unicode) = " + val1);
	    System.out.println("tu(ma unicode) = " + val2);
	}

}
