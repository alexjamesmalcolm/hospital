package hospital;

public class Nurse extends Employee implements MedicalDuties {

	public Nurse(String name, int employeeNumber) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

	@Override
	public int getSalary() {
		return 50000;
	}

}
