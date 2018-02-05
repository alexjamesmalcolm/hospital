package hospital;

import static hospital.Patient.DEFAULT_BLOOD;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class SurgeonTest {

	@Test
	public void shouldHaveName() {
		String name = "Phil";
		int employeeNumber = 111;
		String specialty = "Heart";
		boolean isOperating = true;
		Surgeon underTest = new Surgeon(name, employeeNumber, specialty, isOperating);
		String returnedName = underTest.getName();
		assertThat(returnedName, is("Phil"));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		Surgeon underTest = new Surgeon("", 111, "", true);
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(111));
	}

	@Test
	public void shouldHaveSalary() {
		Surgeon underTest = new Surgeon(null, 0, null, false);
		int salary = underTest.getSalary();
		assertThat(salary, is(120000));
	}

	@Test
	public void shouldBeOperating() {
		Surgeon underTest = new Surgeon(null, 0, null, true);
		boolean status = underTest.isOperating();
		assertThat(status, is(true));
	}

	@Test
	public void shouldNotBeOperating() {
		Surgeon underTest = new Surgeon(null, 0, null, false);
		boolean status = underTest.isOperating();
		assertThat(status, is(false));
	}
	
	@Test
	public void shouldDrawBlood() {
		Surgeon underTest = new Surgeon(null, 0, null, false);
		Patient patient = new Patient();
		underTest.drawBlood(patient);
		int blood = patient.getBloods();
		assertThat(blood, Matchers.lessThan(DEFAULT_BLOOD));
	}
}
