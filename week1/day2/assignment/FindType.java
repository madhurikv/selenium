package week1.day2.assignment;

public class FindType {

	public static void main(String[] args) {
		String str1="$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0, splchar=0, space=0, num=0;
		for (int i = 0; i < str1.length(); i++) {
			if(Character.isAlphabetic(str1.charAt(i))) {
				
				letter++;
		
			}
			else if(Character.isDigit(str1.charAt(i))) {
				num++;
			}
			else if(Character.isSpaceChar(str1.charAt(i))) {
				space++;
			}
			else {
				splchar++;
			}
		}
		
		System.out.println("No of special characters are: "+splchar);
		System.out.println("No of letters are: "+letter);
		System.out.println("No of spaces are: "+space);
		System.out.println("No of numbers are: "+num);

	}

}
