package week1.day2;


public class Calculator {
public int add(int num1,int num2) {
	int sum=num1+num2;
	return sum;
}
	public double sub(double num1,double num2) {
	double result= num1-num2;
	return result;
	}
	public double mul(double num1,double num2) {
	double result= num1*num2;
	return result;
	}
	public int div(int num1,int num2) {
		int result= num1/num2;
		return result;
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("The sum is " +calc.add(10,20));
		System.out.println("The difference os "+calc.sub(25.2, 15.5));
		System.out.println("The product is "+calc.mul(3, 22.5));
		System.out.println("The quotient is "+calc.div(45, 9));
		

	}

}
