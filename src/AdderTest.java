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
}
