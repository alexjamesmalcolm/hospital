package hospital;

public class Janitor extends Employee {

	public Janitor(String name, int employeeNumber, boolean isSweeping) {
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	@Override
	public int getSalary() {
		return 0;
	}

}
