
public class Adder {
	
	public int Add(String numbers) throws Exception {
		if(numbers.isEmpty()) {
			return 0;
		} else if(numbers.contains("\n")) {
			if(numbers.charAt(numbers.length() - 1) == '\n') {
				throw new Exception("Please enter values after new line");
			}
			numbers = numbers.replace("\n", ",");
		}
		int sum = 0;
		String[] tokens = numbers.split(",");
		for(String token : tokens) {
			sum += Integer.parseInt(token);
		}
		return sum;
	}
}
