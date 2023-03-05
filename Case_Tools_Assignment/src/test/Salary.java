package test;
import java.util.Scanner;

public class Salary {
	private double basicSalary;
	Scanner sc = new Scanner(System.in);
	
	public void setBasicSalary(){
		System.out.println("Enter the Basic Salary");
		this.basicSalary=sc.nextDouble();
	}
	public double getBasicSalary() {
		return this.basicSalary;
	}
	public double calcHRA() {
		return 10*(this.basicSalary/100);
	}
	public double calcDA() {
		return 73*(this.basicSalary/100);
	}
	public double calcGS() {
		return this.basicSalary+calcDA()+calcHRA();
	}
	public double calcIncomeTax() {
		return 30*(calcGS()/100);
	}
	public double calcNetSalary() {
		return calcGS()-calcIncomeTax();
	}
}