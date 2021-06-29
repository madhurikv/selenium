package Week3.day2.assignment;


import java.util.Set;
import java.util.TreeSet;

public class SortWithCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
	
		Set<String> stringset = new TreeSet<String>();
		for (String eachelement : input) {
			stringset.add(eachelement);
		}
		System.out.println(stringset);
	}

}
