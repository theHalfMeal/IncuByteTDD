import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdderTest {
	
	@Test
	public void should_return_0_if_empty_string() throws Exception {
		Adder adder = new Adder();
		int actualResult = adder.Add("");
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_single_value_is_present() throws Exception {
		Adder adder = new Adder();
		int actualResult = adder.Add("1");
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_multiple_values_are_present() throws Exception {
		Adder adder = new Adder();
		int actualResult = adder.Add("1,2,3");
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void should_return_sum_if_new_lines_are_present() throws Exception {
		Adder adder = new Adder();
		int actualResult = adder.Add("1\n2,3");
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test()
	public void should_throw_error_if_no_value_after_new_line() {
		Exception exception = assertThrows(Exception.class, () -> {
			new Adder().Add("1,\n");
		});
		String expectedMessage = "Please enter values after new line";
		String actualMessage = exception.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
	
	@Test
	public void should_return_sum_in_case_of_delimiters() throws Exception {
		Adder adder = new Adder();
		int actualResult = adder.Add("//;\n1;2;3");
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test()
	public void should_throw_error_if_negative_value() {
		Exception exception = assertThrows(Exception.class, () -> {
			new Adder().Add("-1");
		});
		String expectedMessage = "negatives not allowed";
		String actualMessage = exception.getMessage();
		assertEquals(expectedMessage, actualMessage);
	} 
	
	@Test()
	public void should_throw_error_if_negative_values() {
		Exception exception = assertThrows(Exception.class, () -> {
			new Adder().Add("-1,-2");
		});
		String expectedMessage = "negatives not allowed:-1,-2";
		String actualMessage = exception.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}
}
