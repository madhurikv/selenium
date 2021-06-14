package week1.day1;

public class PrimeNumber {
	
	

	public static void main(String[] args) {
		int number = 100;
		boolean flag1 = false;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag1=true;
			}
		}
			if(flag1==true) {
				System.out.println("Number is not prime number");
			}else
				System.out.println("Numer is a prime number");
			
		
		

	}

}
