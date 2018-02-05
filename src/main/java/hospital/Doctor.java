package hospital;

public class Doctor extends Employee {

	private String specialty;

	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}

	public void drawBlood(Bleedable bleedable) {
		bleedable.removeBlood(3);
	}

	public int getSalary() {
		return 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

}
