package Week3.day2.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str= "PayPal India";
		Set<Character> set1 = new LinkedHashSet<Character>();
		Set<Character> dupset = new LinkedHashSet<Character>();
		char[] strarray = str.toCharArray();
				for (char eachc : strarray) {
					if(eachc==' ') {
						continue;
					}
					if(set1.add(eachc)==false) {
						dupset.add(eachc);
					}
					
				}
				
					//System.out.println("char array is "+starray[i]);
					
					System.out.println("Set without duplicate elements: " +set1);
					System.out.println("Duplicate characters are: "+dupset);
					set1.removeAll(dupset);
					System.out.println("Set Without duplicate elements: "+set1);
					

	}

}
