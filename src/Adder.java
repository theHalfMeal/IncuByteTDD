
public class Adder {
	
	public int Add(String numbers) throws Exception {
		if(numbers.isEmpty()) {
			return 0;
		}
		String delimiter = ",";
		if(numbers.contains("//")) {
			delimiter = String.valueOf(numbers.charAt(2));
			numbers = numbers.substring(4);
		}
		if(numbers.contains("\n")) {
			if(numbers.charAt(numbers.length() - 1) == '\n') {
				throw new Exception("Please enter values after new line");
			}
			numbers = numbers.replace("\n", delimiter);
		}
		int sum = 0;
		String[] tokens = numbers.split(delimiter);
		for(String token : tokens) {
			int number = Integer.parseInt(token);
			if(number < 0) {
				throw new Exception("negatives not allowed");
			}
			sum += number;
		}
		return sum;
	}
}
