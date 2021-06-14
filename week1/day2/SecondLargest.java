package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] numbers= {30,25,45,50,12,40};
		Arrays.sort(numbers);
		System.out.println("The second largest number is " +numbers[numbers.length-2]);


	}

}
