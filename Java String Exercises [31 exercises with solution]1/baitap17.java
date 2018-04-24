package bt31;

public class baitap17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "This is a sample string.";
	        char[] arr = new char[] { ' ', ' ', ' ', ' ',
	                                  ' ', ' ', ' ', ' ' };
	        str.getChars(4, 10, arr, 2);
	        System.out.println("mang ki tu giong \"" +
	            arr + "\"");
	}

}
