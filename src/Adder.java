
public class Adder {
	
	public int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		} else if(numbers.contains("\n")) {
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
