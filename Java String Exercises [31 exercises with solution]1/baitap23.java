package bt31;

public class baitap23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        boolean match2 = str1.regionMatches(9, str2, 9, 8);
        System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
	}

}
