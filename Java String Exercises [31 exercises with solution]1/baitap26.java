package bt31;

public class baitap26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";
        String startStr = "Red";
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);
        System.out.println( str1 + " bat dau voi " +
             startStr + "? " + starts1);
        System.out.println(str2 + " bat dau voi " +
             startStr + "? " + starts2);
	}

}
