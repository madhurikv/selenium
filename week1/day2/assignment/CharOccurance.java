package week1.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str="Welcome to Chennai";
		int count=0;
		//char[] char1= new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			//char1[i] = str.charAt(i);
			if(str.charAt(i)=='e') {
				count++;
			}
			/*if(char1[i]=='e') {
				count++;
			}*/
		}
		System.out.println("No of occurances of letter 'e' is: "+count);

	}

}
