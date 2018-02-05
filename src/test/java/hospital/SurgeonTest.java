package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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
}
