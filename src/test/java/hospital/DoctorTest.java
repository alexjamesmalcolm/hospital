package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor();
		Patient victim = new Patient();
		int beforeBloodLevel = victim.getBloods();
		underTest.drawBlood(victim);
		int afterBloodLevel = victim.getBloods();
		assertThat(beforeBloodLevel - afterBloodLevel, is(1));
	}
}
