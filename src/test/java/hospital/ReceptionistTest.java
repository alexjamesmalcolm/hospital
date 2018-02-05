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
}
