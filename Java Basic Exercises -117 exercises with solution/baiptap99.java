package btt;

public class baiptap99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {10, 20, 10, 20, 40, 20, 50};
		int kq = 0;	
		int x = 20;
		for(int i = 0; i < mang.length - 1; i++) {
	        if(mang[i] != x && mang[i + 1] != x)
			{
	                                kq = 1;	
			}        
	    }                                   
	    if (kq==0)
	 	  {
	     	 System.out.printf( String.valueOf(true));	         
		  }
	 else
		   	  {
	     	 System.out.printf( String.valueOf(false));	         
		  }		
	}

}
