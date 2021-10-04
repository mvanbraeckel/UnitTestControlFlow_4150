import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunAllTests
{
	public static void main(String[] args)
	{
		/** report a test run */
		Result result = JUnitCore.runClasses(TestOrderingAlpha.class);

		System.out.format("Overall Alpha result was : %s\n",
				result.wasSuccessful() ? "SUCESS" : "FAILURE");

		if ( ! result.wasSuccessful()) {
			System.out.format("List of Alpha test failure messages:\n");
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
		}

		/** report another test run */
		result = JUnitCore.runClasses(TestOrderingBeta.class);
		System.out.format("Overall Beta result was : %s\n",
				result.wasSuccessful() ? "SUCESS" : "FAILURE");

		if ( ! result.wasSuccessful()) {
			System.out.format("List of Beta test failure messages:\n");
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
		}
	}
} 

