package hospital;

public class Receptionist extends Employee {

	private boolean isOnPhone;

	public Receptionist(String name, int employeeNumber, boolean isOnPhone) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.isOnPhone = isOnPhone;
	}

	public boolean isOnPhone() {
		return isOnPhone;
	}

	@Override
	public int getSalary() {
		return 45000;
	}
}
