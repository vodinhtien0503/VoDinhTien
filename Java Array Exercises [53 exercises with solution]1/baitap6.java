package bt53;

public class baitap6 {
		// TODO Auto-generated method stub
		public static int  timthutu (int[] array, int t) {
	        if (array == null) return -1;
	        int len = array.length;
	        int i = 0;
	        while (i < len) {
	            if (array[i] == t) return i;
	            else i=i+1;
	        }
	        return -1;
	    }
	    public static void main(String[] args) {
	      int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	      System.out.println("thu tu cua so 25 la : " + timthutu(array, 25));
	      System.out.println("thu tu chua so 77 la : " + timthutu(array, 77));
	}

}
