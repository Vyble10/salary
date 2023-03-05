package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SalaryTest {
	Salary test = new Salary();

	@Test
	@Order(1)
	public void testSetBasicSalary() {
		test.setBasicSalary();
		assertEquals(30000,test.getBasicSalary());
	}

	@Test
	@Order(2)
	public void testCalcHRA() {
		assertEquals(3000,test.calcHRA());
	}

	@Test
	@Order(3)
	public void testCalcDA() {
		assertEquals(21900,test.calcDA());
	}

	@Test
	@Order(4)
	public void testCalcGS() {
		assertEquals(54900,test.calcGS());
	}

	@Test
	@Order(5)
	public void testCalcIncomeTax() {
		assertEquals(16470,test.calcIncomeTax());
	}

	@Test
	@Order(6)
	public void testCalcNetSalary() {
		assertEquals(38430,test.calcNetSalary());
	}
}
