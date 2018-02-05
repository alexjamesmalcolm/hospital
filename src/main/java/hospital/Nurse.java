package hospital;

public class Nurse {

	public Nurse(int employeeNumber) {
	}

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	public int getEmployeeNumber() {
		return 111;
	}

}
