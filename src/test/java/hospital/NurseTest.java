package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	
	@Test
	public void shouldDrawBlood() {
		Nurse underTest = new Nurse();
		Patient victim = new Patient();
		int bloodBefore = victim.getBloods();
		underTest.drawBlood(victim);
		int bloodAfter = victim.getBloods();
		assertThat(bloodBefore - bloodAfter, is(1));
	}
}
