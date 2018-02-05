package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JanitorTest {

	@Test
	public void shouldHaveName() {
		String name = "Phil";
		int employeeNumber = 111;
		boolean isSweeping = true;
		Employee underTest = new Janitor(name, employeeNumber, isSweeping);
		String returnedName = underTest.getName();
		assertThat(returnedName, is(name));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		Employee underTest = new Janitor("", 111, false);
		int employeeNumber = underTest.getEmployeeNumber();
		assertThat(employeeNumber, is(111));
	}
}