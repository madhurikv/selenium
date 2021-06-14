package week1.day2;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[] nums= {14,12,13,25,15,25,18,16,17,19,18,17,20};
		
		for (int i = 0; i < nums.length; i++) {
			int count =1;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(nums[i]);
			}
		}
		

	}

}
