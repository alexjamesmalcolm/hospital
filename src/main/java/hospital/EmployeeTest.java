package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void shouldHaveDoctorEmployeeNumberBe222() {
		Employee underTest = new Doctor(222);
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(222));
	}
	
	@Test
	public void shouldHaveNurseEmployeeNumberBe333() {
		Employee underTest = new Nurse(333);
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(333));
	}
}
