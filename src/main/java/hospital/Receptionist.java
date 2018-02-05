package hospital;

public class Receptionist {

	private boolean isOnPhone;

	public Receptionist(String name, int employeeNumber, boolean isOnPhone) {
		this.isOnPhone = isOnPhone;
	}

	public boolean isOnPhone() {
		return isOnPhone;
	}
}
