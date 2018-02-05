package hospital;

public class Doctor extends Employee {

	private int employeeNumber;
	private String specialty;

	public Doctor(String name, int employeeNumber, String specialty) {
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}

	public void drawBlood(Bleedable bleedable) {
		bleedable.removeBlood(3);
	}

	public int getSalary() {
		return 90000;
	}

	@Override
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public String getName() {
		return "Phil";
	}

	public String getSpecialty() {
		return specialty;
	}

}
