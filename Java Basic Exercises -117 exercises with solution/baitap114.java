package btt;

import java.util.Arrays;

public class baitap114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abcdef"; 
	     char[] A = st.toCharArray();
		 int of=3;
	     int len = A.length;
	     of %= len;
	     reverse(A, 0, len - of - 1);
	     reverse(A, len - of, len - 1);
	     reverse(A, 0, len - 1);
	     System.out.println("\n"+Arrays.toString(A));
	    }

	    private static void reverse(char[] st, int dau, int cuoi) {
	        while (dau < cuoi) {
	            char temp = st[dau];
	            st[dau] = st[cuoi];
	            st[cuoi] = temp;
	            dau++;
	            cuoi--;
	        }
	}

}
