package btt;

public class baitap38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		dem(test);

	}
	public static void dem(String x){
		char[] ch = x.toCharArray();
		int tu = 0;
		int trong = 0;
		int so = 0;
		int khac = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				tu ++ ;
			}
			else if(Character.isDigit(ch[i])){
				so ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				trong ++ ;
			}
			else{
				khac ++;
			}
		}
		System.out.println("chuoi la : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("tu: " + tu);
		System.out.println("trong: " + trong);
		System.out.println("so: " + so);
		System.out.println("khac: " + khac);
			}
	}


