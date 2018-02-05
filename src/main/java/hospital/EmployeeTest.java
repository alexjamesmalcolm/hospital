package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void shouldHaveDoctorEmployeeNumberBe222() {
		Employee underTest = new Doctor();
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(222));
	}
}
