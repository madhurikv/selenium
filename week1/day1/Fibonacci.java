package week1.day1;

public class Fibonacci {
	

	public static void main(String[] args) {
		int firstSum=0;
		int secondSum=1;
		int sum=1;
		int range =10;
		System.out.print(firstSum +",");
		System.out.print(secondSum);
		for (int i = 0; i <range-2; i++) {
			sum=secondSum+firstSum;
			firstSum = secondSum;
			secondSum = sum;
			System.out.print("," +sum);
			
		}


	}

}
