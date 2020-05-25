package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduction {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-10,-10);
		Integer sum = list.stream()
				.reduce(0,Integer::sum);  // 0 is nothing but identity
		// Indentity will be used in calculation all the time 
		System.out.println("sum= "+sum);
		
		Integer max = list.stream()
				.reduce(0,Integer::max);
		System.out.println("max= "+max);// Result as 0, but max of -10,-10 should be -10. Reason 
		// identity will also be passs of operation. How to fix this. Below
		
		Optional<Integer> max1 = list.stream()
				.reduce(Integer::max);
		System.out.println("max1= "+max1);
		
	}
}
