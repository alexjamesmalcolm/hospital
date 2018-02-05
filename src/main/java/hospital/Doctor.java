package hospital;

public class Doctor extends Employee {

	public Doctor(int employeeNumber) {
		// TODO Auto-generated constructor stub
	}

	public void drawBlood(Bleedable bleedable) {
		bleedable.removeBlood(3);
	}

	public int getSalary() {
		return 90000;
	}

}
