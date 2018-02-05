package hospital;

public abstract class Employee {

	protected String name;
	protected int employeeNumber;

	public abstract int getSalary();

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getName() {
		return name;
	};
}
