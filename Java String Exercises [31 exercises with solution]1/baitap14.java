package bt31;

public class baitap14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";
        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
        System.out.println("\"" + columnist1 + "\" giong \"" +
            columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" giong \"" +
            columnist3 + "\"? " + equals2);
	}

}
