package hospital;

public class Receptionist extends Employee {

	private boolean isOnPhone;

	public Receptionist(String name, int employeeNumber, boolean isOnPhone) {
		this.name = name;
		this.isOnPhone = isOnPhone;
	}

	public boolean isOnPhone() {
		return isOnPhone;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
