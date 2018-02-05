package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor("", 0, "");
		Patient victim = new Patient();

		int beforeBloodLevel = victim.getBloods();
		underTest.drawBlood(victim);
		int afterBloodLevel = victim.getBloods();

		assertThat(beforeBloodLevel - afterBloodLevel, is(3));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {

		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBloodFromTestDouble() {
		Doctor underTest = new Doctor("", 0, "");
		Bleedable patient = new BleedableDouble();
		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor("", 0, "");
		int salary = underTest.getSalary();
		assertThat(salary, is(90000));
	}

	@Test
	public void shouldHaveDoctorEmployeeNumberBe111() {
		Employee underTest = new Doctor("", 111, "");
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(111));
	}

	@Test
	public void shouldHaveDoctorEmployeeNumberBe222() {
		Employee underTest = new Doctor("", 222, "");
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(222));
	}
	
	@Test
	public void shouldHaveSpecialtyArea() {
		Doctor underTest = new Doctor("", 0, "Brain");
		String specialty = underTest.getSpecialty();
		assertThat(specialty, is("Brain"));
	}
	
	@Test
	public void shouldHaveSpecialtyAreaHeart() {
		Doctor underTest = new Doctor("", 0, "Heart");
		String specialty = underTest.getSpecialty();
		assertThat(specialty, is("Heart"));
	}
	
	@Test
	public void shouldHaveNamePhil() {
		Employee underTest = new Doctor("Phil", 0, "");
		String name = underTest.getName();
		assertThat(name, is("Phil"));
	}
	
	@Test
	public void shouldHaveNameJohn() {
		Employee underTest = new Doctor("John", 0, "");
		String name = underTest.getName();
		assertThat(name, is("John"));
	}
}
