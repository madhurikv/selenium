package Week3.Day1;

public class Calculator {
	
	public void add(int no1, int no2) {
		System.out.println(no1+no2);

	}
	public void add(int no1, int no2, int no3) {
		System.out.println(no1+no2+no3);

	}
	public void multiply(int no1,int no2) {
		System.out.println(no1*no2);

	}
	public void multiply(double no1,double no2) {
		System.out.println(no1*no2);

	}
	public void subtract(int no1, int no2) {
		System.out.println(no1-no2);
	}
	public void subtract(double no1, double no2) {
		System.out.println(no1-no2);
	}
	public void divide(int no1,int no2) {
		System.out.println(no1/no2);

	}
	public void divide(double no1,double no2) {
		System.out.println(no1/no2);

	}
	
	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		calc.add(10, 15);
		calc.add(20, 20, 10);
		calc.multiply(10, 10);
		calc.multiply(15.5, 2.5);
		calc.subtract(20, 10);
		calc.subtract(35.8, 20.2);
		calc.divide(50.8, 2.5);
		calc.divide(100, 10);
	}

}
