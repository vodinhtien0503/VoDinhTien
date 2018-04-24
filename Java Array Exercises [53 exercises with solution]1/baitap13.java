package bt53;

public class baitap13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] mang = {"abv", "abc", "abc", "aaa", "bcc", "aaa"};
		 
	        for (int i = 0; i < mang.length-1; i++)
	        {
	            for (int j = i+1; j < mang.length; j++)
	            {
	                if ((mang[i].equals(mang[j])) && (i != j))
	                {
	                    System.out.println("phan tu trung : "+mang[j]);
	                }
	            }
	        }
	}

}
