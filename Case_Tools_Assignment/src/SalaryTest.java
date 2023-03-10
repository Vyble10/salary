import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.Test;

public class SalaryTest {
	Salary test = new Salary(30000);

	@Order(1)
	@Test
	public void testCalcHRA() {
		assertEquals(3000, test.calcHRA());
	}

	@Order(2)
	@Test
	public void testCalcDA() {
		assertEquals(21900, test.calcDA());
	}

	@Order(3)
	@Test
	public void testCalcGS() {
		assertEquals(54900, test.calcGS());
	}

	@Order(4)
	@Test
	public void testCalcIncomeTax() {
		assertEquals(16470, test.calcIncomeTax());
	}

	@Order(5)
	@Test
	public void testCalcNetSalary() {
		assertEquals(38430, test.calcNetSalary());
	}
}
