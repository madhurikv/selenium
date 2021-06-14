package week1.day1;

public class Factorial {
	 

	public static void main(String[] args) {
		int number=5;
		int product=1;
		for(int i=number;i>=1;i--) {
			product = product*i;
		}
System.out.println("Factorial of the given number is " +product);
	}

}
