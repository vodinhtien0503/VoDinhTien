package bt53;

public class baitap12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] mang = {1, 2, 5, 5, 6, 6, 7, 2};
		 
	        for (int i = 0; i < mang.length-1; i++)
	        {
	            for (int j = i+1; j < mang.length; j++)
	            {
	                if ((mang[i] == mang[j]) && (i != j))
	                {
	                    System.out.println("phan tu trung : "+mang[j]);
	                }
	            }
	        }
	}

}
