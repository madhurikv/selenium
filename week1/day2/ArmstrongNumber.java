package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int sum=0;
		int rem=0;
		int original=number;
		
		while(number>0) {
		
			rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;
				
		}
		if(original==sum) {
			System.out.println("It is an ArmstrongNumber");
		}else
			System.out.println("it is not an ArstrongNumber");

	}

}
