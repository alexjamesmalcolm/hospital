package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void shouldHavePhoneStatusTrue() {
		String name = "";
		int employeeNumber = 1;
		boolean isOnPhone = true;
		Receptionist underTest = new Receptionist(name, employeeNumber, isOnPhone);
		boolean status = underTest.isOnPhone();
		assertThat(status, is(true));
	}
	
	@Test
	public void shouldHavePhoneStatusFalse() {
		Receptionist underTest = new Receptionist("", 1, false);
		boolean status = underTest.isOnPhone();
		assertThat(status, is(false));
	}
	
	@Test
	public void shouldHaveNameJohn() {
		Employee underTest = new Receptionist("John",1,true);
		String name = underTest.getName();
		assertThat(name, is("John"));
	}
	
	@Test
	public void shouldHaveEmployeeNumber() {
		Employee underTest = new Receptionist("",111,true);
		int num = underTest.getEmployeeNumber();
		assertThat(num, is(111));
	}
	
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Receptionist("",11,true);
		int salary = underTest.getSalary();
		assertThat(salary, is(45000));
	}
}
