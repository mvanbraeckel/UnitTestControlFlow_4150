
//
// Unittest fixture ordering laboratory
//

// Import all of the decorators required from JUnit
import org.junit.Test;
// ... add code ...
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;

// Import all of the assertions required from JUnit
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestOrderingBeta
{

	// Add a method to do all setup required before any other
	// work in this *class* is done.
	// This will need to be a *static* method -- why?
	@BeforeClass
	public static void setUpClass()
	{
		System.out.format("In setUpClass() - Beta\n");
	}

	// Add a method to do all cleanup required after any other
	// work in this *class* is done.
	// This will need to be a *static* method -- why?
	@AfterClass
	public static void tearDownClass()
	{
		System.out.format("In tearDownClass() - Beta\n");
	}

	// Add a method to do setup required before any single test
	// case is run.
	@Before
	public void setUp()
	{
		System.out.format("  In setUp() - Beta\n");
	}


	// Add a method to do cleanup required after any single test
	// case is run.
	@After
	public void tearDown()
	{
		System.out.format("  In tearDown() - Beta\n");
	}


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

