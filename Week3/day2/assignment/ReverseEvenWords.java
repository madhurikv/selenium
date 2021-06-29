package Week3.day2.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		String text = "I am a software tester  ";
		String[] splitstr = text.split(" ");
		for (int i = 0; i < splitstr.length; i++) {
			if(i%2==1) {
				for (int j = splitstr[i].length()-1; j >= 0; j--) {
					System.out.print(splitstr[i].charAt(j));
				}
				
			}else
				System.out.print(" " +splitstr[i]+" ");

		}
		
	}

}
