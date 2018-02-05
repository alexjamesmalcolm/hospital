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
		Nurse underTest = new Nurse(null, 0);
		Bleedable patient = new BleedableDouble();
		underTest.drawBlood(patient);
		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldHaveEmployeeNumber() {
		int employeeNumber = 111;
		Nurse underTest = new Nurse(null, employeeNumber);
		int returnedEmployeeNumber = underTest.getEmployeeNumber();
		assertThat(returnedEmployeeNumber, is(employeeNumber));
	}

	@Test
	public void shouldHaveSalary() {
		Nurse underTest = new Nurse(null, 0);
		int salary = underTest.getSalary();
		assertThat(salary, is(50000));
	}

	@Test
	public void shouldHaveName() {
		Employee underTest = new Nurse("John", 111);
		String name = underTest.getName();
		assertThat(name, is("John"));
	}
	
	@Test
	public void shouldHaveNamePhil() {
		Employee underTest = new Nurse("Phil", 0);
		String name = underTest.getName();
		assertThat(name, is("Phil"));
	}

	@Test
	public void shouldHaveNurseEmployeeNumberBe333() {
		Employee underTest = new Nurse(null, 333);
		int number = underTest.getEmployeeNumber();
		assertThat(number, is(333));
	}
}
