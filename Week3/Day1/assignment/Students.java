package Week3.Day1.assignment;

public class Students {
	public void getStudentInfo() {
		System.out.println("Student info method");

	}
	public void getStudentInfo(int id) {
		System.out.println("Student info of "+id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student info with id, name:  "+id+ "  " +name);

	}
	public void getStudentInfo(String email, long number) {
		System.out.println("Student info with email, phone number: "+email+" " +number);

	}


	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(11540);
		stud.getStudentInfo(115420, "Madhuri");
		stud.getStudentInfo("madhuri.gmail.com",9946574560L);

	}

}
