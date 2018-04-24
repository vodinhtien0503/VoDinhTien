package bt53;

public class baitap26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mang = {0,0,1,0,3,0,5,0,6};
        int i = 0;
		System.out.print("\nmang goc: \n");
		for (int n : mang)
           System.out.print(n+"  ");
		
       for(int j = 0, l = mang.length; j < l;) {
           if(mang[j] == 0)
               j++;
           else {
               int temp = mang[i];
               mang[i] = mang[j];
               mang[j] = temp;
               i ++;
               j ++;
           }
       }
       while (i < mang.length)
           mang[i++] = 0;
		System.out.print("\nmang sau khi chuyen cac so 0 ra sau cung: \n");
       for (int n : mang)
           System.out.print(n+"  ");
			System.out.print("\n");
	}

}
