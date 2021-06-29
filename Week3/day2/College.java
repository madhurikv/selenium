package Week3.day2;

public class College extends University {
	

	public static void main(String[] args) {
		College col = new College();
		col.ug();
		col.pg();

	}

	@Override
	public void ug() {
		System.out.println("Implemented in the college class");
		
	}

}
