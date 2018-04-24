package bt53;

import java.util.ArrayList;

public class baitap21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list = new ArrayList<String>();

		  list.add("P");
		 
		  list.add("J");
		 
		  list.add("PH");
		  
		  list.add("C#");
		 
		  list.add("C++");
		  
		  list.add("Pe");
		 
		  String[]  my_array = new String[list.size()];
		  
		  list.toArray(my_array);
		  
		  for (String  string : my_array)
		  {
		  System.out.println(string);
		  }
	}

}
