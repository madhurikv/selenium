package week1.day2.assignment;

public class ChangeOddIndicesToUpperCase {

	public static void main(String[] args) {

		 String str1 = "changeme";
		 
		// char[] char1= new char[str1.length()];
		 
		 /*for (int i = 0; i < str1.length(); i++) {
			 
			 char1[i] = str1.charAt(i);
			
		}*/
		 for (int i = 0; i < str1.length(); i++) {
			 if(i%2==1) {
				 System.out.print(Character.toUpperCase(str1.charAt(i)));
				// System.out.println(str1.toUpperCase(str1.charAt(i)));
			 }else {
				// System.out.print(char1[i]);
				 System.out.print(str1.charAt(i));
			 }
			
		}
		 

	}

}
