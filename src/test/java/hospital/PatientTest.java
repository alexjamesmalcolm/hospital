package hospital;

import static hospital.Patient.DEFAULT_BLOOD;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PatientTest {

	@Test
	public void shouldHaveBloodRemoved() {
		Patient patient = new Patient();
		patient.removeBlood(3);
		int currentBloods = patient.getBloods();
		assertThat(currentBloods, is(DEFAULT_BLOOD - 3));
	}
}
