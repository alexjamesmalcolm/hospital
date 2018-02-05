package hospital;

public class Janitor extends Employee {

	private boolean isSweeping;

	public Janitor(String name, int employeeNumber, boolean isSweeping) {
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.isSweeping = isSweeping;
	}

	@Override
	public int getSalary() {
		return 40000;
	}
	
	public boolean isSweeping() {
		return isSweeping;
	}

}
