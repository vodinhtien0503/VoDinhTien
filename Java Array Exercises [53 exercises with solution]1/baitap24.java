package bt53;

public class baitap24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_num;
		   int[] numbers = new int[]{1,2,3,4,6,7};
		   total_num = 7;
		   int sothieu = total_num * ((total_num + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		       System.out.print( sothieu - num_sum);
			   System.out.print("\n");
	}

}
