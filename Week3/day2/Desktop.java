package Week3.day2;

public class Desktop implements HardWare, SoftWare {

	public void softwareResource() {
		System.out.println("Hardware resource is implemented");

	}

	public void hardareResources() {
		System.out.println("Software resource is implemented");

	}
	public void desktopModel() {
		System.out.println("Desktop model");

	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.softwareResource();
		desk.hardareResources();
		desk.desktopModel();

	}

}
