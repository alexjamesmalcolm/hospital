package hospital;

public class Nurse extends Employee {

	public Nurse(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	public int getSalary() {
		return 50000;
	}

}
