package bt53;

public class baitap5 {
	 public static boolean thamchieu(int[] a, int i) {
	      for (int n : a) {
	         if (i == n) {
	            return true;
	         }
	      }
	      return false;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[]= {1,2,3,4,5,6,7,8,9,0
		
};
System.out.println(thamchieu(b,1));
System.out.println(thamchieu(b,10));

	}

}


