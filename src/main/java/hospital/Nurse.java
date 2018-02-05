package hospital;

public class Nurse extends Employee {

	private int employeeNumber;

	public Nurse(String name, int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public int getSalary() {
		return 50000;
	}

	@Override
	public String getName() {
		return "John";
	}

}
