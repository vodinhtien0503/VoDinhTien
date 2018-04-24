package bt53;

import java.util.ArrayList;

public class baitap25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> common = new ArrayList<Integer>();
		   int mang1[] = {2, 4, 8};
		   int mang2[] = {2, 3, 4, 8, 10, 16};
		   int mang3[] = {4, 8, 14, 40};
			int x = 0, y = 0, z = 0;
			while (x < mang1.length && y < mang2.length && z < mang3.length){
				if (mang1[x] == mang2[y] && mang2[y] == mang3[z]){
					common.add(mang1[x]);
					x++;
					y++;
					z++;
				}
				else if (mang1[x] < mang2[y])
					x++;
				else if (mang2[y] < mang3[z])
					y++;
				else
					z++;
			}
			System.out.println("phan tu pho bien: ");
		System.out.println(common);
	}

}
