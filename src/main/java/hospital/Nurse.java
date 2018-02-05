package hospital;

public class Nurse extends Employee {

	public Nurse(int employeeNumber) {
	}

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	public int getEmployeeNumber() {
		return 111;
	}

	public int getSalary() {
		return 50000;
	}

}
