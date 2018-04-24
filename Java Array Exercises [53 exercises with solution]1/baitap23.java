package bt53;

public class baitap23 {
	static void  bt(int[] mang1, int[] mang2)
	  {
	  boolean  gionghoackhong = true;
	  
	  if(mang1.length == mang2.length)
	  {
	  for (int i  = 0; i < mang1.length; i++)
	  {
	  if(mang1[i] != mang2[i])
	  {
	  gionghoackhong = false;
	  }
	  }
	  }
	  else
	  {
	  gionghoackhong  = false;
	  }
	  
	  if  (gionghoackhong)
	  {
	  System.out.println("hai mang giong nhau.");
	  }
	  else
	  {
	  System.out.println("hai mang khong giong nhau.");
	  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int []mang1= {1,2,3,4};
	int []mang3= {1,2,3,4,5};
	int []mang2= {1,2,3,4};
	

	}

}
