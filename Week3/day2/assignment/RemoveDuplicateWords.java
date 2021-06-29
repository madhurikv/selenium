package Week3.day2.assignment;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count= 0;
		String replaceAll = new String();
		String[] splitArray = text.split(" ");
		for (int i = 0; i < splitArray.length; i++) {
			
			for (int j = i+1; j < splitArray.length; j++) {
				if(splitArray[i].equals(splitArray[j])) {
					count++;
					
				}
						
			if(count>1) {
					replaceAll = text.replaceAll(splitArray[i],"");
			}
		}
				
						
		}
	
		System.out.println("String after removing the duplicate words: " +replaceAll);
		

	}

}
