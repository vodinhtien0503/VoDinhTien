package bt53;

import java.util.Arrays;

public class baitap10 {
	static int max;
	static int min;
	public static void max_min(int mang[]) {
        max = mang[0];
         min = mang[0];
        int len = mang.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (mang[i] > max) max = mang[i];
                if (mang[i] < min) min = mang[i];
            }
            if (mang[i] > mang[i + 1]) {
                if (mang[i] > max) max = mang[i];
                if (mang[i + 1] < min) min = mang[i + 1];
            }
            if (mang[i] < mang[i + 1]) {
                if (mang[i] < min) min = mang[i];
                if (mang[i + 1] > max) max = mang[i + 1];
            }
        }
    }
	
	public static void main(String[] args) {
int mang[]= {1,2,3,4,5,6,7};
max_min(mang);
System.out.println("mang goc: "+Arrays.toString(mang));
System.out.println("gia tri lon nhat cua mang:  "+max);
System.out.println("gia tri nho nhat cua mang:  "+min);

	}

}
