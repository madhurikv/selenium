package Week3.day2.assignment;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		//defining a set
		
		Set<Integer> element = new HashSet<Integer>();
		
		//checking the set for the duplicate
		System.out.println("The duplicate elements are:");
		for(Integer number : data) {
			if(element.add(number)==false) 
				System.out.println(number);
				

	}
	}
}
