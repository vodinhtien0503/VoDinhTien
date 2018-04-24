package bt31;

public class baitap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "example.com", str2 = "Example.com";
	    StringBuffer strbuf = new StringBuffer(str1);
	    
	    System.out.println("so sanh "+str1+" va "+strbuf+": " + str1.contentEquals(strbuf));
	    
	    System.out.println("so sanh "+str2+" va"+strbuf+": " + str2.contentEquals(strbuf));
	    
	}

}
