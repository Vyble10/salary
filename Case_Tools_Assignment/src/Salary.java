
public class Salary {
	private double basicSalary;

	public Salary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double calcHRA() {
		return 10 * (this.basicSalary / 100);
	}

	public double calcDA() {
		return 73 * (this.basicSalary / 100);
	}

	public double calcGS() {
		return this.basicSalary + calcDA() + calcHRA();
	}

	public double calcIncomeTax() {
		return 30 * (calcGS() / 100);
	}

	public double calcNetSalary() {
		return calcGS() - calcIncomeTax();
	}
}