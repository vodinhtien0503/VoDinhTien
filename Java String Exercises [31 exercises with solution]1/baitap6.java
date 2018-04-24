package bt31;

public class baitap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "This is Exercise 1";
	        String str2 = "This is Exercise 2";
	        
	        System.out.println("chuoi  1: " + str1);
	        System.out.println("chuoi 2: " + str2); 
	       
	     
	        int result = str1.compareToIgnoreCase(str2);
	        if (result < 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " nho hon  " +
	                "\"" + str2 + "\"");
	        }
	        else if (result == 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " bang " +
	                "\"" + str2 + "\"");
	        }
	        else 
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " lon hon " +
	                "\"" + str2 + "\"");
	        }
	}

}
