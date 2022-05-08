import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdderTest {
	
	@Test
	public void should_return_0_if_empty_string() {
		Adder adder = new Adder();
		int actualResult = adder.Add("");
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_single_value_is_present() {
		Adder adder = new Adder();
		int actualResult = adder.Add("1");
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_multiple_values_are_present() {
		Adder adder = new Adder();
		int actualResult = adder.Add("1,2,3");
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_new_lines_are_present() {
		Adder adder = new Adder();
		int actualResult = adder.Add("1\n2,3");
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
}
