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
		Janitor underTest = new Janitor(name, employeeNumber, isSweeping);
		String returnedName = underTest.getName();
		assertThat(returnedName, is(name));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		Janitor underTest = new Janitor("", 111, false);
		int employeeNumber = underTest.getEmployeeNumber();
		assertThat(employeeNumber, is(111));
	}
	
	@Test
	public void shouldHaveIsSweepingTrue() {
		Janitor underTest = new Janitor("", 1, true);
		boolean isSweeping = underTest.isSweeping();
		assertThat(isSweeping, is(true));
	}
}