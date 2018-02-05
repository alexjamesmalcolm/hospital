package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBlood() {
		Nurse underTest = new Nurse(0);
		Bleedable patient = new BleedableDouble();
		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		int employeeNumber = 111;
		Nurse underTest = new Nurse(employeeNumber);
		int returnedEmployeeNumber = underTest.getEmployeeNumber();
		assertThat(returnedEmployeeNumber, is(employeeNumber));
	}
}
