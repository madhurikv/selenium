package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str1="madam";
		String rev= "";
		for (int i =str1.length()-1; i >= 0; i--) {
			rev = rev+str1.charAt(i);
						
		}
		
		if(str1.equalsIgnoreCase(rev) == true) {
			
			System.out.println("Given string is a palindrome");
			
		}else {
			System.out.println("Given string is not palindrome");
		}
		

	}

}
