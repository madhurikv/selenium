package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,7,6,8};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			
		}
		System.out.println();
		System.out.println("Missing element is");
		
		
		for (int i = 0; i <= nums.length; ++i) {
			
			if(i+1 != nums[i]) {
				System.out.print(i+1);
				break;
			}
			
			}
			
		}

	}


