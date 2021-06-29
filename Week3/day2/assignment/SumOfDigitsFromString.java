package Week3.day2.assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int digSum=0;
		
		String newStr = text.replaceAll("\\D", "");
		
		char[] charArray = newStr.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			digSum=digSum+Character.getNumericValue(charArray[i]);
						
		}
		System.out.println("The sum of digits from the string is: " +digSum);
		

	}

}
