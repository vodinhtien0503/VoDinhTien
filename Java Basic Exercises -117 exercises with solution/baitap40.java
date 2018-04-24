package btt;

import java.nio.charset.Charset;

public class baitap40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("danh sach bo ki tu co san : ");  
	    for (String str : Charset.availableCharsets().keySet()) {
	      System.out.println(str);
	    }
	  }
	}


