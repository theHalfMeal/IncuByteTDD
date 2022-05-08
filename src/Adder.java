import java.util.ArrayList;
import java.util.stream.Collectors;

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
		return getSum(numbers, delimiter);
	}
	
	public int getSum(String numbers, String delimiter) throws Exception {
		int sum = 0;
		String[] tokens = numbers.split(delimiter);
		ArrayList<Integer> negativeNumbers = new ArrayList<>(); 
		for(String token : tokens) {
			int number = Integer.parseInt(token);
			if(number < 0) {
				negativeNumbers.add(number);
			}
			sum += number;
		}
		if(negativeNumbers.size() == 0) {
			return sum;
		} else if(negativeNumbers.size() == 1) {
			throw new Exception("negatives not allowed");
		} else {
			String listString = negativeNumbers.stream().map(Object::toString)
                    .collect(Collectors.joining(","));
			throw new Exception("negatives not allowed:" + listString);
		}
	}
}
