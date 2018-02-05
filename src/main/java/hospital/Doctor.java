package hospital;

public class Doctor extends Employee {

	private int employeeNumber;
	private String specialty;

	public Doctor(int employeeNumber, String specialty) {
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
		// TODO Auto-generated method stub
		return employeeNumber;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSpecialty() {
		return specialty;
	}

}
