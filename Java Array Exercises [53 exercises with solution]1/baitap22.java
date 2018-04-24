 	package bt53;

public class baitap22 {
	static void  pairs_value(int inputArray[], int inputNumber)
	  {
	  System.out.println("cac phan va tong cua chung : ");
	 
	  for (int i =  0; i < inputArray.length; i++)
	  {
	  for (int j  = i+1; j < inputArray.length; j++)
	  {
	  if(inputArray[i]+inputArray[j] == inputNumber)
	  {
	  System.out.println(inputArray[i]+" + "+inputArray[j]+" =  "+inputNumber);
	  }
	  }
	  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pairs_value(new int [] {2,7,8,9},15);
pairs_value(new int[] {15,15,16,14},30);	
	}

}
