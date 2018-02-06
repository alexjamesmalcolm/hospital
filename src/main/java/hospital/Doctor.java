package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public Doctor(String name, int employeeNumber, String specialty) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.specialty = specialty;
	}
	
	@Override
	public int getSalary() {
		return 90000;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public void drawBlood(Bleedable patient) {
		patient.removeBlood(3);
	}

}
