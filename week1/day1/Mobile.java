package week1.day1;

public class Mobile {
	
	public String mobileModel = "Redmi";
	public int mobileWeight = 150;
	public boolean isFullCharge = true;
	public double mobileCost = 45000;
	
	
	public void makeCall() {
		System.out.println("Make a call");

	}
	public void sendMsg() {
System.out.println("sent a msg");
	}

	public static void main(String[] args) {
	
		Mobile myMobile = new Mobile();
		System.out.println("Mobile Model "+myMobile.mobileModel);
		System.out.println("MobileWeight is  "+myMobile.mobileWeight);
		System.out.println("Charged "+myMobile.isFullCharge);
		System.out.println("Mobile Cost "+myMobile.mobileCost);
		myMobile.makeCall();
		myMobile.sendMsg();

	}

}
