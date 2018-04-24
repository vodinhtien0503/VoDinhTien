package bt53;

import java.util.Arrays;
import java.util.HashSet;

public class baitap14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mang1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
		 
	       String[] mang2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
	       
	       System.out.println("mang1 : "+Arrays.toString(mang1));
	       System.out.println("mang2 : "+Arrays.toString(mang2));
	 
	       HashSet<String> set = new HashSet<String>();
	 
	        for (int i = 0; i < mang1.length; i++)
	        {
	            for (int j = 0; j < mang2.length; j++)
	            {
	                if(mang1[i].equals(mang2[j]))
	                {
	                    set.add(mang1[i]);
	                }
	            }
	        }
	 
	        System.out.println("phan tu pho bien : "+(set));
	}

}
