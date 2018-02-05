package hospital;

public class Surgeon extends Doctor {
	
	private boolean isOperating;

	public Surgeon(String name, int employeeNumber, String specialty, boolean isOperating) {
		super(name, employeeNumber, specialty);
		this.isOperating = isOperating;
	}
}
