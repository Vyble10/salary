import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.*;

public class SalaryTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SalaryTest.class);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Test Succesfull");
		} else {
			System.out.println("Test Failed");
		}
	}

}
