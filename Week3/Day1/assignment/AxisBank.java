package Week3.Day1.assignment;

public class AxisBank extends BankInfo{
	public void deposite() {
		System.out.println("In the deposite method of Axisbank");

	}

	public static void main(String[] args) {
		AxisBank bank1 = new AxisBank();
		bank1.fixed();
		bank1.savings();
		bank1.deposite();

	}

}
