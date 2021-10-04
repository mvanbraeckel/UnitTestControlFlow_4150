
//
// Unittest fixture ordering laboratory
//

// Import all of the decorators required from JUnit
import org.junit.Test;
// ... add code ...


// Import all of the assertions required from JUnit
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestOrderingBeta
{

	// Add a method to do all setup required before any other
	// work in this *class* is done.
	// This will need to be a *static* method -- why?
	// ... add code ...


	// Add a method to do all cleanup required after any other
	// work in this *class* is done.
	// This will need to be a *static* method -- why?
	// ... add code ...


	// Add a method to do setup required before any single test
	// case is run.
	// ... add code ...


	// Add a method to do cleanup required after any single test
	// case is run.
	// ... add code ...


	// Test configuration "A" -- a passing test case
	@Test
	public void test_A()
	{
		System.out.format("    In test_A() - Beta\n");
		assertEquals("A", "A");
	}

	// Test configuration "B" -- a failing test case
	@Test
	public void test_B()
	{
		System.out.format("    In test_B() - Beta\n");
		assertEquals("A", "B");
	}

	// Test configuration "C" -- another passing test case
	@Test
	public void test_C()
	{
		System.out.format("    In test_C() - Beta\n");
		assertEquals("C", "C");
	}
}

