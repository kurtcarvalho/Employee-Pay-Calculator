import static org.junit.Assert.*;
import org.junit.Test;

public class Test1 {

	@Test
	public void testIDPass() {
			// assertEquals(String message, long expected, long actual)
			assertEquals("error in EmpID", true, getDetails.checkEmpID("12345", true));
			assertEquals("error in EmpID", true, getDetails.checkEmpID("54321", true));
	}
	@Test
	public void testIDFail() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in EmpID", false, getDetails.checkEmpID("123", true));
		assertEquals("error in EmpID", false, getDetails.checkEmpID("qwwee", true));
		assertEquals("error in EmpID", false, getDetails.checkEmpID("456er", true));
		assertEquals("error in EmpID", false, getDetails.checkEmpID("45633234", true));
		
	}
	@Test
	public void testHoursPass() {
			// assertEquals(String message, long expected, long actual)
			assertEquals("error in Hours", true, getDetails.checkHours(20, true));
			assertEquals("error in Hours", true, getDetails.checkHours(20.5, true));
			assertEquals("error in Hours", true, getDetails.checkHours(59.5, true));
			assertEquals("error in Hours", true, getDetails.checkHours(60, true));
	}
	@Test
	public void testHoursFail() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in Hours", false, getDetails.checkHours(19.5, true));
		assertEquals("error in Hours", false, getDetails.checkHours(60.5, true));
		assertEquals("error in Hours", false, getDetails.checkHours(1, true));
		assertEquals("error in Hours", false, getDetails.checkHours(70, true));
	}
	@Test
	public void testEmpTypePass() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in EmpType", true, getDetails.checkEmpType("C", true));
		assertEquals("error in EmpType", true, getDetails.checkEmpType("P", true));
		assertEquals("error in EmpType", true, getDetails.checkEmpType("F", true));
	}
	@Test
	public void testEmpTypeFail() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in EmpType", false, getDetails.checkEmpType("DDDC", true));
		assertEquals("error in EmpType", false, getDetails.checkEmpType("G", true));
		assertEquals("error in EmpType", false, getDetails.checkEmpType("JDP", true));
		assertEquals("error in EmpType", false, getDetails.checkEmpType("123", true));
	}
	@Test
	public void testRatePass() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in Rate", true, getDetails.getRate("C", 20,  true));
		assertEquals("error in Rate", true, getDetails.getRate("C", 20.5,  true));
		assertEquals("error in Rate", true, getDetails.getRate("C", 34.9,  true));
		assertEquals("error in Rate", true, getDetails.getRate("C", 35,  true));
		assertEquals("error in Rate", true, getDetails.getRate("P", 30,  true));
		assertEquals("error in Rate", true, getDetails.getRate("P", 30.5,  true));
		assertEquals("error in Rate", true, getDetails.getRate("P", 44.9,  true));
		assertEquals("error in Rate", true, getDetails.getRate("P", 45,  true));
		assertEquals("error in Rate", true, getDetails.getRate("F", 35,  true));
		assertEquals("error in Rate", true, getDetails.getRate("F", 35.5,  true));
		assertEquals("error in Rate", true, getDetails.getRate("F", 49.9,  true));
		assertEquals("error in Rate", true, getDetails.getRate("F", 50,  true));
	}
	@Test
	public void testRateFail() {
		// assertEquals(String message, long expected, long actual)
		assertEquals("error in Rate", false, getDetails.getRate("C", 19,  true));
		assertEquals("error in Rate", false, getDetails.getRate("C", 19.5,  true));
		assertEquals("error in Rate", false, getDetails.getRate("C", 35.1,  true));
		assertEquals("error in Rate", false, getDetails.getRate("C", 36,  true));
		assertEquals("error in Rate", false, getDetails.getRate("P", 29.9,  true));
		assertEquals("error in Rate", false, getDetails.getRate("P", 45.1,  true));
		assertEquals("error in Rate", false, getDetails.getRate("P", 50,  true));
		assertEquals("error in Rate", false, getDetails.getRate("F", 34.9,  true));
		assertEquals("error in Rate", false, getDetails.getRate("F", 50.1,  true));
		assertEquals("error in Rate", false, getDetails.getRate("F", 55,  true));
		
	}
}
