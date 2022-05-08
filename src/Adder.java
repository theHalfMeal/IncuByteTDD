
public class Adder {
	
	public int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		int sum = 0;
		String[] tokens = numbers.split(",");
		for(String token : tokens) {
			sum += Integer.parseInt(token);
		}
		return sum;
	}
}
