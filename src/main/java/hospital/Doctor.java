package hospital;

public class Doctor extends Employee {

	private int employeeNumber;

	public Doctor(int employeeNumber) {
		this.employeeNumber = employeeNumber;
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

}
